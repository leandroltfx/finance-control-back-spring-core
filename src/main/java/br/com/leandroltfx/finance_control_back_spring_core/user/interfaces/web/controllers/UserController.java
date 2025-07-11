package br.com.leandroltfx.finance_control_back_spring_core.user.interfaces.web.controllers;

import br.com.leandroltfx.finance_control_back_spring_core.user.application.usecases.RegisterUserUseCase;
import br.com.leandroltfx.finance_control_back_spring_core.user.interfaces.web.dtos.RegisterUserRequestDto;
import br.com.leandroltfx.finance_control_back_spring_core.user.interfaces.web.mappers.UserMapper;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final RegisterUserUseCase registerUserUseCase;

    public UserController(RegisterUserUseCase registerUserUseCase) {
        this.registerUserUseCase = registerUserUseCase;
    }

    @PostMapping()
    public ResponseEntity<?> registerUser(
            @Valid @RequestBody RegisterUserRequestDto registerUserRequestDto
    ) {
        this.registerUserUseCase.execute(UserMapper.toDomain(registerUserRequestDto));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
