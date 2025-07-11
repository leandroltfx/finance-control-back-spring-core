package br.com.leandroltfx.finance_control_back_spring_core.user.infrastructure.persistence.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity(name = "users")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, length = 30)
    private String userName;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 100)
    private String password;

}
