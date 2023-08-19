package lv.javaguru.java1.student_butrin_ilya.lesson_11.day3;

public interface ProductDatabase {
        void save(Product product);
        Product findByTitle(String productTitle);

}

