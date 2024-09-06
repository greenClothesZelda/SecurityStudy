package com.example.securitystudy.repository;

import com.example.securitystudy.dto.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    boolean existsByUsername(String username);


    UserEntity findByUsername(String username);
}
