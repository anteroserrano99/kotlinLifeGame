package com.game.life.simulation.model.node

import com.game.life.simulation.model.LifeGameEvent
import org.slf4j.Logger
import org.slf4j.LoggerFactory

data class Node(val x: Int, val y: Int) : Observer {

    //TODO MODIFY LOGIC WITHIN A NODE
    val logger: Logger = LoggerFactory.getLogger(Node::class.java)

    override fun update(event: LifeGameEvent) {
        logger.info("${event.action} in node $x $y")
    }
}
