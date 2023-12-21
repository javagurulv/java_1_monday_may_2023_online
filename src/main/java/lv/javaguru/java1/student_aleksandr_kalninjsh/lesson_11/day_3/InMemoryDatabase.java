package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_11.day_3;

public class InMemoryDatabase implements ProductDataBase {


    Product[] products = {
            new Product("TV"),
            new Product("Fridge")
    };

    String title;
    public String getTitle(){return this.title;}

    @Override
    public void save(Product product) {
        Product[] newProducts = new Product[products.length +1];
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
}
