package com.game.life.simulation.model

enum class CharacterTier(val id: Int) {

    LOW(0),
    HIGH(1);


    companion object {
        fun fromId(id: Int): CharacterTier {
            return values().first { characterTier -> characterTier.id == id }
        }

    }

}

