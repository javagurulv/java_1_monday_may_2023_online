package lv.javaguru.java1.student_timur_geldiev.lesson_11.homework.day_3;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDatabase implements ProductDatabase {

    Product[] arrayOfProducts = new Product[0];
    int size = 0;
    List<Product> productList = new ArrayList<>();


    @Override
    public void save(Product product) {
        if (size == arrayOfProducts.length) {
            Product[] newProducts = new Product[arrayOfProducts.length + 1];
            System.arraycopy(arrayOfProducts, 0, newProducts, 0, size);
            arrayOfProducts = newProducts;

        }
        arrayOfProducts[size] = product;
        size++;
        productList.add(product);
    }
    @Override
    public Product[] getAllProducts(){
        return productList.toArray(new Product[0]);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : arrayOfProducts) {
            String found = product.getTitle();
            if (found.equals(productTitle)) {
                return product;
            }
        }
        return null;
    }

}

