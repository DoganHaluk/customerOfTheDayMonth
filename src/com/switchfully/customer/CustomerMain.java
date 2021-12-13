package com.switchfully.customer;

import java.time.LocalDate;
import java.util.*;
import java.util.Scanner;

public class CustomerMain {
    public static void main(String[] args) {
        var date = LocalDate.now();
        var ListOfDailyNamesAndScores = new HashMap<String, Integer>();
        var ListOfMonthlyNamesAndScores = new HashMap<String, Integer>();
        var scanner = new Scanner(System.in);
//Deneme
        //Caglar deneme
        //Haluk deneme 15
        //Haluk deneme 16
        var dailyReceipts1 = new ArrayList<Receipt>();
        dailyReceipts1.add(new Receipt("Jane Janukova", new String[]{"cheese", "bread", "tomatoes", "chocolate", "water", "book", "jam", "flowers", "bananas"}));
        dailyReceipts1.add(new Receipt("Jane Janukova", new String[]{"cheese", "bread", "tomatoes", "chocolate", "water", "book", "jam", "flowers", "bananas", "bananas", "Smartphone X"}));
        dailyReceipts1.add(new Receipt("Haluk Dogan", new String[]{"cheese", "bread", "tomatoes", "chocolate", "water", "book", "jam", "flowers", "bananas"}));
        dailyReceipts1.add(new Receipt("Caglar Cercinli", new String[]{"cheese", "bread", "tomatoes", "chocolate", "water", "book", "jam", "flowers", "bananas", "Smartphone X"}));
        dailyReceipts1.add(new Receipt("", new String[]{"cheese", "bread", "tomatoes", "chocolate", "water", "book", "jam", "flowers", "bananas", "apples", "juice"}));

        dailyReceipts1.removeIf(receipt -> receipt.getName().isEmpty());
        dailyReceipts1.forEach(receipt -> ListOfDailyNamesAndScores.merge(receipt.getName(), receipt.getScore(), Integer::sum));

        System.out.println("\nCustomer-of-the-day Report | Date of generation:" + date + "\nCustomer | Score");
        ListOfDailyNamesAndScores.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
        ListOfDailyNamesAndScores.forEach((key, value) -> ListOfMonthlyNamesAndScores.merge(key, value, Integer::sum));
        ListOfDailyNamesAndScores.clear();

        System.out.println("Do you want to generate a monthly report?");
        var answer = scanner.nextLine();
        if (answer.equals("yes")) {
            if (date == date.withDayOfMonth(date.lengthOfMonth())) {
                System.out.println("\nCustomer-of-the-month Report | Date of generation:" + date + "\nCustomer | Score");
                ListOfMonthlyNamesAndScores.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .forEach(System.out::println);
            } else {
                System.out.println("You have to wait until the end of the month!");
            }
        }



        var dailyReceipts2 = new ArrayList<Receipt>();
        dailyReceipts2.add(new Receipt("Caglar Cercinli", new String[]{"cheese", "bread", "tomatoes", "chocolate", "water", "book", "jam", "flowers", "bananas", "apples", "juice"}));
        dailyReceipts2.add(new Receipt("Haluk Dogan", new String[]{"cheese", "bread", "tomatoes", "chocolate", "water", "book", "jam", "flowers", "bananas", "apples", "juice", "Smartphone X"}));
        dailyReceipts2.add(new Receipt("Jane Janukova", new String[]{"cheese", "bread", "tomatoes", "chocolate", "water", "book", "jam", "flowers", "bananas", "apples", "juice", "cheese", "bread", "tomatoes", "chocolate", "water", "book", "jam", "flowers", "bananas", "apples", "juice"}));
        dailyReceipts2.add(new Receipt("Jane Janukova", new String[]{"cheese", "bread", "tomatoes", "chocolate", "water", "book", "jam", "flowers", "bananas", "apples", "juice", "cheese", "bread", "tomatoes", "chocolate", "water", "book", "jam", "flowers", "bananas", "apples", "juice", "Smartphone X"}));

        dailyReceipts2.removeIf(receipt -> receipt.getName().isEmpty());
        dailyReceipts2.forEach(receipt -> ListOfDailyNamesAndScores.merge(receipt.getName(), receipt.getScore(), Integer::sum));

        System.out.println("\nCustomer-of-the-day Report | Date of generation:" + date + "\nCustomer | Score");
        ListOfDailyNamesAndScores.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
        ListOfDailyNamesAndScores.forEach((key, value) -> ListOfMonthlyNamesAndScores.merge(key, value, Integer::sum));
        ListOfDailyNamesAndScores.clear();

        System.out.println("Do you want to generate a monthly report?");
        var answ = scanner.nextLine();
        if (answ.equals("yes")) {
            if (date == date) {
                System.out.println("\nCustomer-of-the-month Report | Date of generation:" + date + "\nCustomer | Score");
                ListOfMonthlyNamesAndScores.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .forEach(System.out::println);
            } else {
                System.out.println("You have to wait until the end of the month!");
            }
        }
    }
}
