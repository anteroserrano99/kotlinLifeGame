package com.game.life.simulation.business

import com.game.life.simulation.model.Character
import com.game.life.simulation.model.CharacterTier
import kotlin.random.Random

class RandomCharacterGenerator {


    companion object {
        fun generateCharacter(): Character {

            return Character(
                    "N0" + Random.nextInt(0, 99).toString(),
                    Random.nextInt(100, 199),
                    Random.nextInt(200, 299),
                    CharacterTier.fromId(Random.nextInt(0, CharacterTier.values().size))
            )
        }

        fun generateCharacterList(): List<Character> {

            val characterList = ArrayList<Character>()
            val listSize = Random.nextInt(0, 2)
            for (i in 1..listSize) characterList.add(generateCharacter())

            return characterList
        }
    }

}