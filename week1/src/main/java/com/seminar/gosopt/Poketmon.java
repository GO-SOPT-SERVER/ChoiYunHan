package com.seminar.gosopt;

public class Poketmon {

    private String name;
    private String type;
    private String skill;

    public Poketmon(String name) {
        this.name = name;
    }

    public Poketmon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Poketmon() {

    }

    public Poketmon(String name, String type, String skill) {
        this.name = name;
        this.type = type;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSkill() {
        return skill;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
