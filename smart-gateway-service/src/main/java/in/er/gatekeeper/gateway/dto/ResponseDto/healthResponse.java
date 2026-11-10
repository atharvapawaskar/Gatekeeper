package in.er.gatekeeper.gateway.dto.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class healthResponse {

    private String serviceName;
    private String serviceDesrciption;
    private String appStatus;
}
