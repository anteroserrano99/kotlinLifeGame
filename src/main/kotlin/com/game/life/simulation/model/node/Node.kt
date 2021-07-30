package com.game.life.simulation.model.node

import com.game.life.simulation.model.Character
import com.game.life.simulation.model.LifeGameEvent
import org.slf4j.Logger
import org.slf4j.LoggerFactory

data class Node(var x: Int, val y: Int, val characterList : List<Character>? = ArrayList()) : ObserverNode {

    //TODO MODIFY LOGIC WITHIN A NODE
    private val logger: Logger = LoggerFactory.getLogger(Node::class.java)

    override fun update(event: LifeGameEvent) {
        logger.info("${event.action} in node $x $y")
        logger.info("Characters = ${characterList.toString()}")
    }
}
