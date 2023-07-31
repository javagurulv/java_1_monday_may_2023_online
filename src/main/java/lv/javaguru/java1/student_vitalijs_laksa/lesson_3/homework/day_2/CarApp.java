package lv.javaguru.java1.student_vitalijs_laksa.lesson_3.homework.day_2;

public class CarApp {
    public static void main(String[] args) {

        Car x1 = new Car("BMW", "Black", 10200);
        Car x2 = new Car("Mercedes-Benz", "Silver", 7500);

        System.out.println("First registration is " + x1.getModel() +" "+ x1.getColor() + " with a price of " + x1.getPrice());
        System.out.println("First registration is " + x2.getModel() +" "+ x2.getColor() + " with a price of " + x2.getPrice());

        x1.setColor("Blue");
        x1.setPrice(13000);
        x2.setColor("Blue");
        x2.setPrice(10000);

        System.out.println(x1.getModel() + " changed a color to a " + x1.getColor() + " and price increased up to " + x1.getPrice() );
        System.out.println(x2.getModel() + " changed a color to a " + x2.getColor() + " and price increased up to " + x2.getPrice() );

    }

}
