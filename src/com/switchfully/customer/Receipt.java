package com.switchfully.customer;

import java.util.Arrays;

public class Receipt {
    private final String name;
    private final String[] products;
    private int score=0;

    public Receipt(String name, String[] products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        if (name.equals("Jane Janukova")) {
            score += 10;
        }
        if (products.length > 30) {
            score += 9;
        } else if (products.length > 20) {
            score += 7;
        } else if (products.length > 10) {
            score += 5;
        }
        if (Arrays.asList(products).contains("Smartphone X")) {
            score += products.length * 5;
        }
        return score;
    }
}
