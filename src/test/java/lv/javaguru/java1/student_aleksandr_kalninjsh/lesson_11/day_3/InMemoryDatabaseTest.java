package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_11.day_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryDatabaseTest {

    InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();

    @Test
    public void save() {
        inMemoryDatabase.save(new Product("Vacuum cleaner"));
        int result = inMemoryDatabase.products.length;
        assertEquals(result, 3);
    }

    @Test
    public void findByTitle() {
        inMemoryDatabase.save(new Product("TV"));
        inMemoryDatabase.save(new Product("Fridge"));
        inMemoryDatabase.save(new Product("Vacuum cleaner"));
        Product result = inMemoryDatabase.findByTitle("Vacuum cleaner");
        assertEquals(result.getTitle(), "Vacuum cleaner");
    }

}