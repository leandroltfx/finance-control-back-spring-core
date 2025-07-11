package br.com.leandroltfx.finance_control_back_spring_core.user.application.usecases;

import br.com.leandroltfx.finance_control_back_spring_core.user.infrastructure.persistence.entities.UserEntity;

public interface RegisterUserUseCase {

    void execute(UserEntity userEntity);

}
