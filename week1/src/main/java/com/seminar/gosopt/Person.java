package com.seminar.gosopt;

import lombok.Getter;

public abstract class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
