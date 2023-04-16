package com.seminar.week2.domain;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class User {

    private Long id;
    private String gender;
    private String name;
    private String contact;
    private int age;
    private boolean isStudent;

    @Builder
    public User(Long id, String gender, String name, String contact, int age, boolean isStudent) {
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.contact = contact;
        this.age = age;
        this.isStudent = isStudent;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }
}
