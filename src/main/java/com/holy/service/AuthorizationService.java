package com.holy.service;

import com.holy.entity.UsersEntity;
import com.holy.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class AuthorizationService implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

    // Get UserDetails for Security
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserDetails loadedUser;
        try {
            UsersEntity client = usersRepository.findByUserName(userName);
            Set<GrantedAuthority> roles = new HashSet();
            roles.add(new SimpleGrantedAuthority(client.getRole()));
            loadedUser = new org.springframework.security.core.userdetails.User(client.getUserName(),
                    client.getPassword(), roles);
        } catch (Exception repositoryProblem) {
            throw new InternalAuthenticationServiceException(repositoryProblem.getMessage(), repositoryProblem);
        }
        return loadedUser;
    }
}
