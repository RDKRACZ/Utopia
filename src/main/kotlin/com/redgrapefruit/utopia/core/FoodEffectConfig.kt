package com.redgrapefruit.utopia.core

import com.redgrapefruit.utopia.module.Module
import com.redgrapefruit.utopia.module.SetModule
import com.redgrapefruit.utopia.util.IntRange
import net.minecraft.entity.effect.StatusEffect

/**
 * This data class stores all the details about a food effect
 */
@SetModule(Module.REALISM)
data class FoodEffectConfig(
    /**
     * The applied [StatusEffect].
     */
    val statusEffect: StatusEffect,
    /**
     * The duration of the [StatusEffect].
     */
    val duration: Int = 0,
    /**
     * The [IntRange] of possible durations.
     */
    val durationRange: IntRange? = null,
    /**
     * The amplifier of the [StatusEffect].
     */
    val amplifier: Int = 0,
    /**
     * The [IntRange] of possible durations.
     */
    val amplifierRange: IntRange? = null,
    /**
     * Is the effect permanently applied. If true, sets [chance] to 1f.
     */
    val isPermanent: Boolean = false,
    /**
     * Is the effect always applied. If true, sets [duration] to [Int.MAX_VALUE].
     */
    val isAlwaysApplied: Boolean = false,
    /**
     * The chance of the effect being applied.
     */
    val chance: Float = 0f
)
