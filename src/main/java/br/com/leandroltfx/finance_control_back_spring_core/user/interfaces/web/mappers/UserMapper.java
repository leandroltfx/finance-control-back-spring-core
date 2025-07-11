package br.com.leandroltfx.finance_control_back_spring_core.user.interfaces.web.mappers;

import br.com.leandroltfx.finance_control_back_spring_core.user.infrastructure.persistence.entities.UserEntity;
import br.com.leandroltfx.finance_control_back_spring_core.user.interfaces.web.dtos.RegisterUserRequestDto;

public class UserMapper {

    public static UserEntity toDomain(RegisterUserRequestDto registerUserRequestDto) {
        return UserEntity
                .builder()
                .userName(registerUserRequestDto.getUserName())
                .email(registerUserRequestDto.getEmail())
                .password(registerUserRequestDto.getPassword())
                .build();
    }

}
