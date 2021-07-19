package com.game.life.simulation.model.node

data class Cluster(val nodes: List<Node>) : Observable {
    override val observers: MutableList<Observer> = ArrayList()


}



