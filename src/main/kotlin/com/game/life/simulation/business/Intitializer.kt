package com.game.life.simulation.business

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class Intitializer {

    val logger: Logger = LoggerFactory.getLogger(Intitializer::class.java)


    @PostConstruct
    fun init() {
        logger.info("I started")
    }


}