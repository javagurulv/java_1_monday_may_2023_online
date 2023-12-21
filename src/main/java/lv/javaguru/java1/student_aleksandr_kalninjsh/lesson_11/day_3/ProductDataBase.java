package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_11.day_3;

public interface ProductDataBase {

    void save(Product product);

    Product findByTitle(String productTitle);
}
