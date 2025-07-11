package br.com.leandroltfx.finance_control_back_spring_core.user.infrastructure.adapter;

import br.com.leandroltfx.finance_control_back_spring_core.user.domain.ports.out.UserPersistencePort;
import br.com.leandroltfx.finance_control_back_spring_core.user.infrastructure.persistence.UserRepository;
import br.com.leandroltfx.finance_control_back_spring_core.user.infrastructure.persistence.entities.UserEntity;

public class UserPersistenceAdapter implements UserPersistencePort {

    private final UserRepository userRepository;

    public UserPersistenceAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(UserEntity userEntity) {
        this.userRepository.save(userEntity);
    }
}
