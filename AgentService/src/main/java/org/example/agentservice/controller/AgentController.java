package org.example.agentservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.agentservice.entity.Agent;
import org.example.agentservice.service.AgentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/agent")
@RequiredArgsConstructor
public class AgentController {
    private final AgentService agentService;

    @PostMapping("/add")
    public ResponseEntity<Agent> addAgent(@RequestBody Agent agent) {
        return ResponseEntity.ok(agentService.createAgent(agent));
    }

    // get vaccination center data by centerId
    @GetMapping("/center/{centerId}")
    public ResponseEntity<Object> getAgentData(@PathVariable Integer centerId) {
        return ResponseEntity.ok(agentService.getVaccinationCenter(centerId));
    }

    // get citizens data by centerId
    @GetMapping("/center/{centerId}/citizens")
    public ResponseEntity<Object> getCitizens(@PathVariable Integer centerId) {
        return ResponseEntity.ok(agentService.getCitizens(centerId));
    }


}
