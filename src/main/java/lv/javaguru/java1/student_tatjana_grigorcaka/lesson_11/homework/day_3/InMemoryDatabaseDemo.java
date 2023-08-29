package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_3;

import java.util.Arrays;

public class InMemoryDatabaseDemo {

    public static void main(String[] args) {

        Product[] products = {
                new Product("Tomato"),
                new Product("Cucumber"),
        };

        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();

        inMemoryDatabase.save(new Product("Carrot"));
        inMemoryDatabase.findByTitle("Tomato");

        System.out.println("New Array Value: " + inMemoryDatabase.products.length);
        System.out.println("Found Product: " + inMemoryDatabase.findByTitle("Tomato").getTitle());
    }
}



