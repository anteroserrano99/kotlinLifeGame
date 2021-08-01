package com.game.life.simulation.controllers

import com.game.life.simulation.business.StateManager
import com.game.life.simulation.model.node.Cluster
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StateController {


    @Autowired
    private lateinit var stateManager: StateManager

    @GetMapping("/getState")
    fun getState(): Cluster {

        return stateManager.getState()
    }


}