package com.game.life.simulation.business

import com.game.life.simulation.model.node.Cluster
import com.game.life.simulation.model.node.Node
import com.game.life.simulation.model.node.ObserverNode
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component


//TODO This is right now a mock class that must be modified in order to have persistence and also In Memory storage for performance
@Component
class StateManager (@Value("\${life.game.properties.length}") val length: Int,
                    @Value("\${life.game.properties.height}") val height: Int){

    private var clusterList: ArrayList<Cluster> = ArrayList()


    init {


        for (i in 0..length) {
            var nodeList: MutableList<ObserverNode> = mutableListOf()
            for (j in 0..height) {
                nodeList.add(Node(i, j, RandomCharacterGenerator.generateCharacterList()
                ))
            }
            clusterList.add(Cluster(nodeList))
        }

    }


    fun getState(): ArrayList<Cluster> {
        return clusterList
    }

    fun modifyNode(node: Node): Node {
        this.clusterList[node.x].nodes[node.y] = node

        return node

    }

    fun getNode(x: Int, y: Int): Node {
        return this.clusterList[x].nodes[y] as Node
    }

}