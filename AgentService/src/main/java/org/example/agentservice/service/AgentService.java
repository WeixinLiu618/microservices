package org.example.agentservice.service;

import lombok.RequiredArgsConstructor;
import org.example.agentservice.client.CitizenClient;
import org.example.agentservice.client.VaccinationClient;
import org.example.agentservice.entity.Agent;
import org.example.agentservice.repository.AgentRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class AgentService {
    private final AgentRepository agentRepository;
    private final CitizenClient citizenClient;
    private final VaccinationClient vaccinationClient;


    public Object getVaccinationCenter(Integer centerId) {
        return vaccinationClient.getVaccinationCenterById(centerId);
    }


    public Object getCitizens(Integer centerId) {
        return citizenClient.getCitizensByCenter(centerId);
    }

//    public Map<String, Object> getData(Integer centerId) {
//        Map<String, Object> response = new HashMap<>();
//        response.put("vaccinationCenter", vaccinationClient.getVaccinationCenterById(centerId));
//        response.put("citizens", citizenClient.getCitizensByCenter(centerId));
//        return response;
//    }

    public Agent createAgent(Agent agent) {
        return agentRepository.save(agent);
    }
}

