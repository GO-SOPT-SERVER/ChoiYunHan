package com.seminar.gosopt;

import lombok.Getter;

public class Athletes extends Person {

    private SportsType type;

    public SportsType getType() {
        return type;
    }

    public Athletes(SportsType type) {
        this.type = type;
    }
}
