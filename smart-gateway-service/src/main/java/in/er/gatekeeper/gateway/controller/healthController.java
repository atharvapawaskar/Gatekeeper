package in.er.gatekeeper.gateway.controller;



import in.er.gatekeeper.gateway.dto.ResponseDto.healthResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class healthController {

    private String serviceName;
    private String serviceDescription;

    public healthController(@Value("${info.app.name}") String serviceName,
                            @Value("${info.app.description}") String serviceDescription){
        this.serviceName=serviceName;
        this.serviceDescription= serviceDescription;
    }

    @GetMapping
    public ResponseEntity<healthResponse>  health(){
        return ResponseEntity.ok(
                new healthResponse(serviceName,serviceDescription,"UP")
        );
    }
}
