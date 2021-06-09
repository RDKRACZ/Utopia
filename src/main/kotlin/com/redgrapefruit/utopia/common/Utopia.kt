package com.redgrapefruit.utopia.common

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.redgrapefruit.utopia.common.module.ModuleConfig
import com.redgrapefruit.utopia.common.module.ModuleFeature
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.Identifier
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import java.security.SecureRandom
import java.util.*

const val UNUSED_PROPERTY: Int = Integer.MIN_VALUE
const val UNUSED_PROPERTY_FLOAT: Float = Float.MIN_VALUE
const val MOD_ID: String = "utopia"

val LOG: Logger = LogManager.getLogger()
val GSON: Gson = GsonBuilder().setPrettyPrinting().create()
val RANDOM: Random = SecureRandom()
val GROUP: ItemGroup = FabricItemGroupBuilder.create(Identifier(MOD_ID, "utopia")).icon { ItemStack(Items.ACACIA_BOAT) }.build()
lateinit var CONFIG: ModuleConfig

class Utopia : ModInitializer {
    override fun onInitialize() {
        CONFIG = ModuleConfig.init()
        ModuleFeature.executeCommon(CONFIG)
    }
}