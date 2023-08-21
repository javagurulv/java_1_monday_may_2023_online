package lv.javaguru.java1.student_timur_geldiev.lesson_11.homework.day_3;

public interface ProductDatabase {

    void save(Product product);
    Product findByTitle(String productTitle);
    Product[] getAllProducts();

}
