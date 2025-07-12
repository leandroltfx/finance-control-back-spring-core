package br.com.leandroltfx.finance_control_back_spring_core.user.domain.ports.out;

import br.com.leandroltfx.finance_control_back_spring_core.user.infrastructure.persistence.entities.UserEntity;

import java.util.List;

public interface UserPersistencePort {

    void save(UserEntity userEntity);

    List<UserEntity> findUserByUserNameOrEmail(String userName, String email);

}
