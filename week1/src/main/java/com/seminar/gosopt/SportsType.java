package com.seminar.gosopt;

public enum SportsType {
    FOOTBALL("축구"),
    BASKETBALL("농구"),
    TENNIS("테니스");

    private final String value;

    SportsType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
