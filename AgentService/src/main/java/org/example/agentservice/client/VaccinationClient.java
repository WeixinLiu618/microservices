package org.example.agentservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "VACCINATION-CENTER")
public interface VaccinationClient {
    @GetMapping("/vaccinationcenter/id/{id}")
    Object getVaccinationCenterById(@PathVariable("id") Integer id);
}
