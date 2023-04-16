package com.seminar.gosopt;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        FootballPlayer footballPlayer = new FootballPlayer(SportsType.FOOTBALL);
        System.out.println(footballPlayer.getType());
        footballPlayer.introduce();


        Poketmon ggobugi = new Poketmon("ggobugi");
        System.out.println(System.identityHashCode(ggobugi));
        System.out.println(ggobugi.getClass());
        System.out.println(ggobugi.getName());
        System.out.println(ggobugi.getSkill());

        List<String> foodList = new ArrayList<>();
        foodList.add("apple");
        foodList.add("banana");
        foodList.add("orange");

        for (String food: foodList) {
            System.out.println(food);
        }
    }
}