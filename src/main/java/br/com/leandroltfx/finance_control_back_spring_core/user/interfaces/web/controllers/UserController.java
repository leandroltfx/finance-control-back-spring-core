package br.com.leandroltfx.finance_control_back_spring_core.user.interfaces.web.controllers;

import br.com.leandroltfx.finance_control_back_spring_core.user.interfaces.web.dtos.RegisterUserRequestDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping()
    public ResponseEntity<?> registerUser(
            @Valid @RequestBody RegisterUserRequestDto registerUserRequestDto
    ) {
        return ResponseEntity.ok("POST: registerUser OK");
    }

}
