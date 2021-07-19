package com.game.life.simulation.business

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
        logger.info("I started")

        for (i in 0..length) {
            logger.info("I started $i")
        }
    }


}