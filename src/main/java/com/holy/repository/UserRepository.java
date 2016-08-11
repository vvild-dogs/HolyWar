package com.holy.repository;

import com.holy.entity.UsersTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UsersTest, Long> {

    UsersTest findByUserName(String s);
}
