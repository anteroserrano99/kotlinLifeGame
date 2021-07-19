package com.game.life.simulation.model.node

import com.game.life.simulation.model.LifeGameEvent

interface Observable {
    val observers: MutableList<Observer>

    fun add(observer: Observer){
        observers.add(observer)
    }

    fun remove(observer: Observer){
        observers.remove(observer)
    }

    fun notifyObservers(event: LifeGameEvent) {
        observers.forEach { observer -> observer.update(event) }
    }


}