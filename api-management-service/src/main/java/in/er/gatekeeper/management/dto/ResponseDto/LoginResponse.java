package in.er.gatekeeper.management.dto.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public class LoginResponse {

    private String token;
    private String tokenType;
    private Long expiresInSeconds;
    private String role;
    private Long organizationId;
}
