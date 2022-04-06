package com.kachan.registrationserver.repository;

import com.kachan.registrationserver.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    @Transactional
    <S extends User> S save(S entity);
}
