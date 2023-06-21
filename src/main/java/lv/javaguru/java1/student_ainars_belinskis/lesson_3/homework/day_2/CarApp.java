package lv.javaguru.java1.student_ainars_belinskis.lesson_3.homework.day_2;

public class CarApp {
    public static void main(String[] args) {
        CarList carOne = new CarList("Audi", "Red", 25000);
        CarList carTwo = new CarList("VW", "Blue", 15000);
        CarList carFr = new CarList("VOLVO", "Black", 40000);

        System.out.println("Auto 1: ");
        System.out.println(carOne.getAutoBrand());
        System.out.println(carOne.getColor());
        System.out.println(carOne.getAutoPr());
        carOne.setAutoBrand("New AUDI");
        carOne.setColor("New Red");
        carOne.setAutoPr(27000);
        System.out.println("Auto 1: ");
        System.out.println(carOne.getAutoBrand());
        System.out.println(carOne.getColor());
        System.out.println(carOne.getAutoPr());

        System.out.println("Auto 2: ");
        System.out.println(carTwo.getAutoBrand());
        System.out.println(carTwo.getColor());
        System.out.println(carTwo.getAutoPr());
        carTwo.setAutoBrand("New VW");
        carTwo.setColor("New Blue");
        carTwo.setAutoPr(21000);
        System.out.println("Auto 2: ");
        System.out.println(carTwo.getAutoBrand());
        System.out.println(carTwo.getColor());
        System.out.println(carTwo.getAutoPr());

        System.out.println("Auto 3: ");
        System.out.println(carFr.getAutoBrand());
        System.out.println(carFr.getColor());
        System.out.println(carFr.getAutoPr());
        carFr.setAutoBrand("New VOLVO");
        carFr.setColor("New Black");
        carFr.setAutoPr(44000);
        System.out.println("Auto 3: ");
        System.out.println(carFr.getAutoBrand());
        System.out.println(carFr.getColor());
        System.out.println(carFr.getAutoPr());


    }
}
