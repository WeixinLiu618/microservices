package org.example.agentservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CITIZEN-SERVICE")
public interface CitizenClient {

    @GetMapping("/citizen/id/{id}")
    List<Object> getCitizensByCenter(@PathVariable("id") Integer centerId);
}
