package com.holy.repository;

import com.holy.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UsersEntity, Long> {

    UsersEntity findByUserName(String userName);
}
