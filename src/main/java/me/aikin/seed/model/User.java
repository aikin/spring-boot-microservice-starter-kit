package me.aikin.seed.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class User implements Serializable {
    private Long id;  //TODO: generate auto
    private String  userName;
    private Timestamp createdAt;

    public User(Long id, String userName, Timestamp createdAt) {
        this.id = id;
        this.userName = userName;
        this.createdAt = createdAt;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

}
