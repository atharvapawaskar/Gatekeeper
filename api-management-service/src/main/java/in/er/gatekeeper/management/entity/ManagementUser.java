package in.er.gatekeeper.management.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.Join;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "management_users")
@Getter
@Setter
@NoArgsConstructor

public class ManagementUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id",nullable = false)
    private Role role;

    private String username;
    private String password_hash;
    private boolean enabled;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;




}
