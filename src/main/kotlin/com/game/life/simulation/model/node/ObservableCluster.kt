package com.game.life.simulation.model.node

import com.game.life.simulation.model.LifeGameEvent

interface ObservableCluster {
    val observerNodes: MutableList<ObserverNode>

    fun add(observerNode: ObserverNode){
        observerNodes.add(observerNode)
    }

    fun remove(observerNode: ObserverNode){
        observerNodes.remove(observerNode)
    }

    fun notifyObservers(event: LifeGameEvent) {
        observerNodes.forEach { observer -> observer.update(event) }
    }


}