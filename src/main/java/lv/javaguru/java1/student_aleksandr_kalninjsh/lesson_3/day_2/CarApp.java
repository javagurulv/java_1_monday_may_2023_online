package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_3.day_2;

public class CarApp {

    public static void main(String[] args) {

        Car car1 = new Car("BWW","Black",50000);
        Car car2 = new Car("Audi","White",74000);
        Car car3 = new Car("Toyota","Silver",25000);

        System.out.println("Car1 brand is: " +  car1.getBrand() + " Car1 color is: " + car1.getColor() + " Car1 price is: " + car1.getPrice());
        System.out.println("Car2 brand is: " +  car2.getBrand() + " Car2 color is: " + car2.getColor() + " Car2 price is: " + car2.getPrice());
        System.out.println("Car3 brand is: " +  car3.getBrand() + " Car3 color is: " + car3.getColor() + " Car3 price is: " + car3.getPrice());

        car1.setBrand("Mercedes-Benz");
        car1.setColor("Blue");
        car1.setPrice(27000);
        System.out.println("Car1 changed brand is: " + car1.getBrand() + " color: " + car1.getColor() + " price: " + car1.getPrice());

        car2.setBrand("Lamborghini");
        car2.setColor("Yellow");
        car2.setPrice(280000);
        System.out.println("Car2 changed brand is: " + car2.getBrand() + " color " + car2.getColor() + " price: " + car2.getPrice());

        car3.setBrand("Ferrari");
        car3.setColor("Red");
        car3.setPrice(350000);
        System.out.println("Car3 changed brand is: " + car3.getBrand() + " color " + car3.getColor() + " price: " + car3.getPrice());






    }
}