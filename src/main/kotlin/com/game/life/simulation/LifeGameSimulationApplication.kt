package com.game.life.simulation

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.function.context.config.ContextFunctionCatalogAutoConfiguration

@SpringBootApplication(exclude = [ContextFunctionCatalogAutoConfiguration::class])
class LifeGameSimulationApplication

fun main(args: Array<String>) {
	runApplication<LifeGameSimulationApplication>(*args)
}
