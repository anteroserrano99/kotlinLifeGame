package com.game.life.simulation.model.node

import com.game.life.simulation.model.LifeGameEvent

interface ObserverNode {

    fun update(event: LifeGameEvent)
}