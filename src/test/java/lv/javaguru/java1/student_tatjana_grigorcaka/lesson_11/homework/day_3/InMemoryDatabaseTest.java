package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryDatabaseTest {

    InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
    Product[] products = {
            new Product("Tomato"),
            new Product("Cucumber"),
    };

    @Test
    public void save() {
        inMemoryDatabase.save(new Product("Carrot"));
        int result = inMemoryDatabase.products.length;
        assertEquals(result, 3);
    }

    @Test
    public void findByTitle() {
        inMemoryDatabase.save(new Product("Tomato"));
        inMemoryDatabase.save(new Product("Cucumber"));
        inMemoryDatabase.save(new Product("Carrot"));
        Product result = inMemoryDatabase.findByTitle("Tomato");
        assertEquals(result.getTitle(),"Tomato");
    }
}