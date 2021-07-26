package com.game.life.simulation.business

import com.game.life.simulation.model.node.Cluster
import com.game.life.simulation.model.node.Node
import com.game.life.simulation.model.node.ObserverNode
import java.lang.RuntimeException
import kotlin.properties.Delegates


//TODO This is right now a mock class that must be modified in order to have persistence and also In Memory storage for performance
class StateManager {

    private var cluster : Cluster

    private val length : Int = 9


    init {

        var nodeList: MutableList<ObserverNode> = mutableListOf()

        for (i in 0..length) {
            nodeList.add(Node(0,i,null))
        }
        this.cluster = Cluster(nodeList)

    }


    fun getState(): Cluster {
        return cluster
    }

    fun modifyNode(node : Node) : Node{
        this.cluster.observerNodes[node.x] = node

        return node

    }

    fun getNode(x: Int, y: Int): Node {
        return this.cluster.observerNodes[y] as Node
    }

    fun insertNode(node : Node) {
        this.cluster.add(node)
    }

    fun deleteNode(x: Int, y: Int) {
        this.cluster.observerNodes.removeAt(y)
    }


}