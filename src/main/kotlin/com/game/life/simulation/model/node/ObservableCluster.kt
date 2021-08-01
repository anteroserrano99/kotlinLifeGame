package com.game.life.simulation.model.node

import com.game.life.simulation.model.LifeGameEvent

interface ObservableCluster {
    val nodes: MutableList<ObserverNode>

    fun add(observerNode: ObserverNode) {
        nodes.add(observerNode)
    }

    fun remove(observerNode: ObserverNode) {
        nodes.remove(observerNode)
    }

    fun notifyObservers(event: LifeGameEvent) {
        nodes.forEach { observer -> observer.update(event) }
    }


}