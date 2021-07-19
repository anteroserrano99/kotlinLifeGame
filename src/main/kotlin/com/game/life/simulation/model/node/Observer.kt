package com.game.life.simulation.model.node

import com.game.life.simulation.model.LifeGameEvent

interface Observer {

    fun update(event: LifeGameEvent)
}