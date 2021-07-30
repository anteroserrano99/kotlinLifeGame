package com.game.life.simulation.business

import com.game.life.simulation.model.Character
import com.game.life.simulation.model.CharacterTier
import kotlin.random.Random
import kotlin.random.nextUInt

class CharacterGenerator {

    fun generate(): Character {

        return Character(
                "N0" + Random.nextInt(0, 99).toString(),
                Random.nextInt(100, 199),
                Random.nextInt(200, 299),
                CharacterTier.fromId(Random.nextInt(0, CharacterTier.values().size))
        )
    }


}