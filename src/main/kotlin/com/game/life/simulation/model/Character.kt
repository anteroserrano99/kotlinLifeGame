package com.game.life.simulation.model

data class Character(
        val name: String = "",
        val attack: Int = 0,
        val hp: Int = 0,
        val type: CharacterTier = CharacterTier.LOW
) {


    override fun toString(): String {
        return "name = $name"
    }
}


