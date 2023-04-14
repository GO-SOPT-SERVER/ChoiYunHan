package com.seminar.gosopt;

import lombok.Getter;

@Getter
public class FootballPlayer extends Athletes{

    public FootballPlayer(SportsType type) {
        super(type);
    }

    protected void introduce() {
        System.out.println("저는 " + this.getType().getValue() + "선수 입니다.");
    }
}
