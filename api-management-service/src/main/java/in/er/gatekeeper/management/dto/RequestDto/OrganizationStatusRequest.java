package in.er.gatekeeper.management.dto.RequestDto;

import in.er.gatekeeper.management.entity.OrganizationStatus;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrganizationStatusRequest {

    @NotNull
    private OrganizationStatus status;

}
