package br.com.leandroltfx.finance_control_back_spring_core.user.interfaces.web.dtos;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.NotBlank;

import lombok.Data;

import org.hibernate.validator.constraints.Length;

@Data
public class RegisterUserRequestDto {

    @NotBlank(message = "Informe o nome de usuário")
    @Pattern(regexp = "^\\S+$", message = "O nome de usuário não deve conter espaços em branco")
    @Length(min = 3, max = 30, message = "O nome de usuário deve conter entre 3 e 30 caracteres")
    private String userName;

    @NotBlank(message = "Informe o e-mail")
    @Pattern(regexp = "^[a-z0-9.]+@[a-z0-9]+\\.[a-z]+(\\.[a-z]+)?$", message = "E-mail inválido")
    @Length(max = 100, message = "O e-mail não deve ultrapassar 100 caracteres")
    private String email;

    @NotBlank(message = "Informe a senha")
    @Length(min = 8, max = 100, message = "A senha deve conter entre 8 e 100 caracteres")
    private String password;

}
