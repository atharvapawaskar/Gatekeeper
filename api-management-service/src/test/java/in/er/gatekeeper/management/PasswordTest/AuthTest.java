package in.er.gatekeeper.management.PasswordTest;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class AuthTest {
    public static void main(String[] args) {

        BCryptPasswordEncoder encoder =
                new BCryptPasswordEncoder();

        String newHash = encoder.encode("platform123");

        System.out.println("New BCrypt hash: " + newHash);

        System.out.println(
                "Verification: " +
                        encoder.matches("platform123", newHash)
        );
    }
}
