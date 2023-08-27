package lv.javaguru.java1.student_butrin_ilya.lesson_11.day3;

public class demo {
    public static void main(String[] args) {
        Product ris = new Product("ris");
        Product kartoska = new Product("kartoska");
        Product Nudls = new Product("nudls");
        InMemoryDatabase data = new InMemoryDatabase();
        data.save(ris);
        data.save(kartoska);
        data.save(Nudls);
        data.findByTitle("ris");
        data.findByTitle("riis");

    }
}
