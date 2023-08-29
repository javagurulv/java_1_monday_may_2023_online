package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_11.homework.day_3;


import java.util.Arrays;

public class InMemoryDatabase implements ProductDatabase {

    Product[] products = {
        new Product("Tomato"),
        new Product("Cucumber"),
        };
    private String title;

    @Override
    public void save(Product product) {
        Product[] newProducts = new Product[products.length + 1];
        System.arraycopy(products, 0, newProducts, 0, products.length);
        newProducts[products.length] = product;
        products = newProducts;
        }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }


    public String getTitle() {
        return this.title;
    }
}
