package com.game.life.simulation.model.node

import com.game.life.simulation.model.LifeGameEvent

data class Cluster(override val nodes: MutableList<ObserverNode>) : ObservableCluster, ObserverNode {

    //TODO In order to update our cluster of nodes we propagate the current event in all the children
    override fun update(event: LifeGameEvent) {
        nodes.forEach { node -> node.update(event) }
    }


}



