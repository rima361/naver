package com.audio.account.repositories;

import com.audio.account.models.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(@Param("email") String email);
}
