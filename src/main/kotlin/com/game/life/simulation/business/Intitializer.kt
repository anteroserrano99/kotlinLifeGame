package com.game.life.simulation.business

import com.game.life.simulation.model.LifeGameEvent
import com.game.life.simulation.model.node.Cluster
import com.game.life.simulation.model.node.Node
import com.game.life.simulation.model.node.ObserverNode
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class Intitializer (
        @Value("\${life.game.properties.length}") length: Int,
        @Value("\${life.game.properties.height}") height: Int){

    val length : Int = length
    val height: Int = height


val logger: Logger = LoggerFactory.getLogger(Intitializer::class.java)


    @PostConstruct
    fun init(

    ) {

        val stateManager = StateManager()

        logger.info("I started")

        val cluster = stateManager.getState()

        //TODO Example of how to use coroutines for our application
        runBlocking {
            launch {
                delay(5000L)
                cluster.notifyObservers(LifeGameEvent("An event has occured"))
            }
            launch {
                delay(2000L)
            logger.info("It been 2 seconds only")

            }
            logger.info("Im done immediately")
        }
        logger.info("I wait until the coroutine is done")

    }


}