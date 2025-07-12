package br.com.leandroltfx.finance_control_back_spring_core.user.infrastructure.adapter;

import br.com.leandroltfx.finance_control_back_spring_core.user.domain.ports.out.UserPersistencePort;
import br.com.leandroltfx.finance_control_back_spring_core.user.infrastructure.persistence.UserRepository;
import br.com.leandroltfx.finance_control_back_spring_core.user.infrastructure.persistence.entities.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserPersistenceAdapter implements UserPersistencePort {

    private final UserRepository userRepository;

    public UserPersistenceAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(UserEntity userEntity) {
        this.userRepository.save(userEntity);
    }

    @Override
    public List<UserEntity> findUserByUserNameOrEmail(String userName, String email) {
        return this.userRepository.findByUserNameOrEmail(userName, email);
    }
}
