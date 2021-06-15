package com.redgrapefruit.utopia.common.item

import com.redgrapefruit.utopia.common.GROUP
import com.redgrapefruit.utopia.common.core.FoodEngine
import com.redgrapefruit.utopia.common.core.data.FoodCategory
import com.redgrapefruit.utopia.common.core.data.FoodConfig
import com.redgrapefruit.utopia.common.core.state.FoodProfile
import com.redgrapefruit.utopia.common.core.state.FoodState
import net.minecraft.client.item.TooltipContext
import net.minecraft.entity.Entity
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.FoodComponent
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import net.minecraft.world.World

/**
 * Represents a fresh food item as well as a base for other variants
 */
@Suppress("JoinDeclarationAndAssignment")
open class FoodItem : Item {
    // Linked data structures
    private val config: FoodConfig
    val profile: FoodProfile

    // Variant settings
    protected var state: FoodState = FoodState.FRESH
    protected var overrideEffects: Boolean = false
    protected var isSalt: Boolean = false

    // Linked variants
    var rottenVariant: RottenFoodItem? = null
    var overdueVariant: OverdueFoodItem? = null

    /**
     * Protected constructor for creating customized [FoodComponent] instances
     * @param config [FoodConfig] of this food item
     * @param group The [ItemGroup] that the item belongs to
     * @param componentAction A lambda that returns the generated [FoodComponent]
     */
    protected constructor(
        config: FoodConfig,
        group: ItemGroup,
        componentAction: () -> FoodComponent
    ) : super(Settings().group(group).food(componentAction.invoke())) {
        this.config = config
        this.profile = FoodProfile()
    }

    /**
     * Public constructor for creating standard instances of food items (fresh)
     * @param config [FoodConfig] of this food item
     */
    constructor(config: FoodConfig) : this(config, GROUP, {
        val builder = FoodComponent.Builder()

        // Hunger
        builder.hunger(config.category.baseHunger + config.hunger)
        // Meat
        if (config.category == FoodCategory.MEAT) builder.meat()
        // Snack
        if (config.category.baseHunger + config.hunger < 2) builder.snack()
        // Saturation modifier
        builder.saturationModifier(config.category.baseSaturationModifier + config.saturationModifier)
        // Effect
        // If durationRange isn't defined (null), then check if the effect is permanent, if yes, the duration is 999999, else it's effectConfig.duration
        // Else pick a random duration out of the durationRange using IntRange.pick
        val duration = if (config.effect.durationRange == null)
            (if (config.effect.isPermanent) 999999 else config.effect.duration)
        else config.effect.durationRange.pick()

        // If amplifierRange isn't defined (null), then use effectConfig.amplifier
        // Else pick a random amplifier out of the amplifierRange using IntRange.pick
        val amplifier = if (config.effect.amplifierRange == null)
            config.effect.amplifier
        else config.effect.amplifierRange.pick()

        builder.statusEffect(
            StatusEffectInstance(
                config.effect.statusEffect,
                duration,
                amplifier
            ), if (config.effect.isAlwaysApplied) 1f else config.effect.chance
        )

        builder.build()
    })

    // Builders

    fun rottenVariant(rottenVariant: RottenFoodItem): FoodItem {
        this.rottenVariant = rottenVariant
        return this
    }

    fun overdueVariant(overdueVariant: OverdueFoodItem): FoodItem {
        this.overdueVariant = overdueVariant
        return this
    }

    override fun inventoryTick(stack: ItemStack, world: World, entity: Entity, slot: Int, selected: Boolean) {
        super.inventoryTick(stack, world, entity, slot, selected)

        if (entity is PlayerEntity && !overrideEffects) {
            FoodEngine.inventoryTick(config, profile, entity, slot, world, rottenVariant, overdueVariant, isSalt)
        }
    }

    override fun appendTooltip(
        stack: ItemStack,
        world: World?,
        tooltip: MutableList<Text>,
        context: TooltipContext
    ) {
        super.appendTooltip(stack, world, tooltip, context)

        FoodEngine.appendTooltip(tooltip, config, profile, state)
    }
}