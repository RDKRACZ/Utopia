package com.redgrapefruit.utopia.common.core

import com.redgrapefruit.utopia.common.LOG
import net.minecraft.nbt.NbtCompound
import java.lang.ArithmeticException

/**
 * Current fridge state.
 */
enum class FridgeState(val boolValue: Boolean, val nbtKey: Int) {
    /**
     * Represents a state when the food is put inside of a fridge
     */
    IN_FRIDGE(true, 0),

    /**
     * Represents a state when the food is taken out of a fridge, but the tick loss hasn't yet been compensated
     */
    NOT_COMPENSATED(false, 1),

    /**
     * Represents a state when the food is taken out of a fridge and the tick loss has already been compensated
     */
    NOT_IN_FRIDGE(false, 2);

    companion object Serialization {
        private fun byNbtKey(nbtKey: Int): FridgeState {
            return when (nbtKey) {
                0 -> IN_FRIDGE
                1 -> NOT_COMPENSATED
                2 -> NOT_IN_FRIDGE
                else -> throw ArithmeticException("NBT Key for FridgeState is invalid")
            }
        }

        /**
         * Deserializes a [FridgeState] from an [NbtCompound]
         * @param prefix The prefix of the [FridgeState] to avoid conflicts
         * @param nbt The input [NbtCompound]
         * @return Deserialized value
         */
        fun readNbt(prefix: String, nbt: NbtCompound): FridgeState {
            return byNbtKey(nbt.getInt("$prefix : Value"))
        }

        /**
         * Serializes a [FridgeState] into an [NbtCompound]
         * @param prefix The prefix of the [FridgeState] to avoid conflicts
         * @param state The serialized [FridgeState]
         * @param nbt The output [NbtCompound]
         */
        fun writeNbt(prefix: String, state: FridgeState, nbt: NbtCompound) {
            nbt.putInt("$prefix : Value", state.nbtKey)
        }
    }
}