package lv.javaguru.java1.student_timur_geldiev.lesson_3.homework.day2;

public class CarApp {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Black", 29999.99);
        Car car2 = new Car("Ferrari", "Red", 458920.999);
        Car car3 = new Car("Fiat", "Pink", 17000);

        System.out.println("First car brand is " + car1.getBrand() + " with " + car1.getColor() + " color and price " + car1.getPrice() + " euro.");
        System.out.println("Second car brand is " + car2.getBrand() + " with " + car2.getColor() + " color and price " + car2.getPrice() + " euro.");
        System.out.println("Third car brand is " + car3.getBrand() + " with " + car3.getColor() + " color and price " + car3.getPrice() + " euro.");

        car1.setBrand("Honda");
        car1.setColor("White");
        car1.setPrice(35000);

        car2.setBrand("Hyndai");
        car2.setColor("Blue");
        car2.setPrice(25000);

        car3.setBrand("BMW");
        car3.setColor("Silver");
        car3.setPrice(95000);

        System.out.println("After changes first car brand is " + car1.getBrand() + " with " + car1.getColor() + " color and price " + car1.getPrice() + " euro");
        System.out.println("After changes second car brand is " + car2.getBrand() + " with " + car2.getColor() + " color and price " + car2.getPrice() + " euro");
        System.out.println("After changes third car brand is " + car3.getBrand() + " with " + car3.getColor() + " color and price " + car3.getPrice() + " euro");

    }
}
