package com.game.life.simulation.business

import com.game.life.simulation.model.LifeGameEvent
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class Intitializer(
        @Value("\${life.game.properties.length}") val length: Int,
        @Value("\${life.game.properties.height}") val height: Int) {


    @Autowired
    private lateinit var stateManager: StateManager

    val logger: Logger = LoggerFactory.getLogger(Intitializer::class.java)


    @PostConstruct
    fun init(

    ) {

        logger.info("I started at $length and $height")

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