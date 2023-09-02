package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_3.homework.day_2;

public class CarApp {

    public static void main(String[] args) {

        Car car1 = new Car("Ferrari","Red",55555);
        Car car2 = new Car("Tesla","Black",44444);
        Car car3 = new Car("BMW","White",33333);

        System.out.println("Car1 brand: " + car1.getBrand());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Price: " + car1.getPrice());
        System.out.println("Car2 brand: " + car2.getBrand());
        System.out.println("Color: " + car2.getColor());
        System.out.println("Price: " + car2.getPrice());
        System.out.println("Car3 brand: " + car3.getBrand());
        System.out.println("Color: " + car3.getColor());
        System.out.println("Price: " + car3.getPrice());

        car1.setBrand("BMW");
        car1.setColor("Orange");
        car1.setPrice(343434);
        System.out.println("Car1 brand changed: " + car1.getBrand());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Price: " + car1.getPrice());
        car2.setBrand("Ferrari");
        car2.setColor("Yellow");
        car2.setPrice(5656565);
        System.out.println("Car2 brand changed: " + car2.getBrand());
        System.out.println("Color: " + car2.getColor());
        System.out.println("Price: " + car2.getPrice());
        car3.setBrand("Tesla");
        car3.setColor("Brown");
        car3.setPrice(454545);
        System.out.println("Car3 brand changed: " + car3.getBrand());
        System.out.println("Color: " + car3.getColor());
        System.out.println("Price: " + car3.getPrice());
    }
}
