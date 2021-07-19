package com.game.life.simulation.business

import com.game.life.simulation.model.LifeGameEvent
import com.game.life.simulation.model.node.Cluster
import com.game.life.simulation.model.node.Node
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class Intitializer (
        @Value("\${life.game.properties.length}") length: Int,
        @Value("\${life.game.properties.height}") height: Int){

    val length : Int = length
    val height: Int = height


val logger: Logger = LoggerFactory.getLogger(Intitializer::class.java)


    @PostConstruct
    fun init(

    ) {
        logger.info("I started")
        var cluster: Cluster = Cluster(ArrayList())
        var nodeList: MutableList<Node> = mutableListOf()

        for (i in 0..height) {
            for(j in 0..length){
                val node = Node(i, j)
                nodeList.add(node)
                cluster.add(node)
            }
        }

        cluster.notifyObservers(LifeGameEvent("An event has occured"))

    }


}