package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_11.day_3;

public class InMemoryDatabaseDemo {

    public static void main(String[] args) {

        Product[] products = {
                new Product("TV"),
                new Product("Fridge")
        };

        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();

        inMemoryDatabase.save(new Product("Vacuum cleaner"));
        inMemoryDatabase.findByTitle("Vacuum cleaner");

        System.out.println("New products: " + inMemoryDatabase.products.length);
        System.out.println("Found product: " + inMemoryDatabase.findByTitle("Vacuum cleaner").getTitle());




    }
}
