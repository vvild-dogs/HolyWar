package com.holy.entity;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "userName", nullable = false, length = 25)
    private String userName;
    @Column(name = "password", nullable = false, length = 1024)
    private String password;
    @Column(name = "role", nullable = false, length = 25)
    private String role;

    public UsersEntity(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
