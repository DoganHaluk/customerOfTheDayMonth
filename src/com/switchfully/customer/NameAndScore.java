package com.switchfully.customer;

public class NameAndScore {
    private final int score;
    private final String name;

    public NameAndScore(String name, int score) {
        this.score = score;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
