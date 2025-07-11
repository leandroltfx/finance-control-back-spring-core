package br.com.leandroltfx.finance_control_back_spring_core.user.application.usecases.impl;

import br.com.leandroltfx.finance_control_back_spring_core.user.application.usecases.RegisterUserUseCase;
import br.com.leandroltfx.finance_control_back_spring_core.user.domain.ports.out.UserPersistencePort;
import br.com.leandroltfx.finance_control_back_spring_core.user.infrastructure.persistence.entities.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserUseCaseImpl implements RegisterUserUseCase {

    private final UserPersistencePort userPersistencePort;

    public RegisterUserUseCaseImpl(UserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public void execute(UserEntity userEntity) {
        this.userPersistencePort.save(userEntity);
    }

}
