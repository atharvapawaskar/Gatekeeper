package in.er.gatekeeper.management.controller;

import in.er.gatekeeper.management.dto.ResponseDto.HealthResponse;
import in.er.gatekeeper.management.service.HealthService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/health")
public class healthController {

   public final HealthService healthService;

    public healthController(HealthService healthService){
        this.healthService=healthService;
    }

    @GetMapping
    public ResponseEntity<HealthResponse> health(){
        String dbStatus=healthService.getHealth();
        return ResponseEntity.ok(new HealthResponse("UP",dbStatus, LocalDateTime.now()));
    }
}

