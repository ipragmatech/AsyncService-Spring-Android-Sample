package com.ipragmatech.asyncservice.model.response;

import java.io.Serializable;

/**
 * Created by kapiljain on 23/05/15.
 */
public class UserEvent implements Serializable {

    private Long id;

    private String name;

    private int age;

    UserEvent() {
    }

    public UserEvent(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}