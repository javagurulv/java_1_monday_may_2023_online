package lv.javaguru.java1.student_butrin_ilya.lesson_11.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductDatabaseTest {
    Product ris = new Product("ris");
    Product kartoska = new Product("kartoska");
    Product Nudls = new Product("nudls");

    @Test
    void save() {
        InMemoryDatabase data = new InMemoryDatabase();
        data.save(ris);
        data.save(kartoska);
        data.save(Nudls);
        int realrezult = 3;
        int expected = data.dataBase.length;
        assertEquals(expected, realrezult);

    }

    @Test
    void findByTitle() {
        InMemoryDatabase data = new InMemoryDatabase();
        data.save(ris);
        data.save(kartoska);
        data.save(Nudls);
        String realrezult = "ris";
        Product expect = data.findByTitle("ris");
        String expected = expect.getName();
        assertEquals(realrezult, expected);

    }

    @Test
    void findByTitleNull() {
        InMemoryDatabase data = new InMemoryDatabase();
        data.save(ris);
        data.save(kartoska);
        data.save(Nudls);
        String realrezult = null;
        Product expect = data.findByTitle("riis");
        assertEquals(realrezult, expect);

    }
}