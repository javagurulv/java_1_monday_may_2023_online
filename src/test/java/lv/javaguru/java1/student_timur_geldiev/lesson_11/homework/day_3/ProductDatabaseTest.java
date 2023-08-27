package lv.javaguru.java1.student_timur_geldiev.lesson_11.homework.day_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductDatabaseTest {

    @Test
    void save() {
        String expected = "TestProduct";
        ProductDatabase check = new InMemoryDatabase();
        Product productToSave = new Product("TestProduct");
        check.save(productToSave);
        Product[] productsArrayActual = check.getAllProducts();

        assertEquals(expected, productsArrayActual[0].getTitle());
    }

    @Test
    void findByTitle() {
        String  expected = "TestProduct";
        ProductDatabase check = new InMemoryDatabase();
        Product productToSave = new Product("TestProduct");
        check.save(productToSave);
        Product actual = check.findByTitle("TestProduct");
        assertEquals(expected, actual.getTitle());
    }
}