package com.holy.service;

import com.holy.entity.UsersEntity;
import com.holy.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private UsersRepository usersRepository;

    public UsersEntity getUserMetaForRegistration(String userName, String password, String role){
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setUserName(userName);
        usersEntity.setPassword(password);
        usersEntity.setRole(role);
        return usersRepository.save(usersEntity);
    }
}
