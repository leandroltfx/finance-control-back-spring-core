package br.com.leandroltfx.finance_control_back_spring_core.user.domain.ports.out;

import br.com.leandroltfx.finance_control_back_spring_core.user.infrastructure.persistence.entities.UserEntity;

import java.util.Optional;

public interface UserPersistencePort {

    void save(UserEntity userEntity);

    Optional<UserEntity> findUserByUserNameOrEmail(String userName, String email);

}
