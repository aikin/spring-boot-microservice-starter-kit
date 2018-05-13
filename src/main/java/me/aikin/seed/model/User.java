package me.aikin.seed.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class User implements Serializable {
    private BigInteger id;  //TODO: generate auto
    private String  userName;
    private Date createdAt; //TODO: should use timespan

    public User(BigInteger id, String userName, Date createdAt) {
        this.id = id;
        this.userName = userName;
        this.createdAt = createdAt;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}
