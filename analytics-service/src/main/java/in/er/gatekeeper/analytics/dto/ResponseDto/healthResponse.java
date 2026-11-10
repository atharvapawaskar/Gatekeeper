package in.er.gatekeeper.analytics.dto.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class healthResponse {
    private String serviceName;
    private String serviceDescription;
    private String appStatus;
}
