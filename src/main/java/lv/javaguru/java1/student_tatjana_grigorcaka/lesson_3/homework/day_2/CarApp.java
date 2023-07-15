package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.homework.day_2;

class CarApp {
    public static void main(String[] args) {
        Car carOne = new Car ("Porsche Cayenne", "yellow", 100000);
        Car carTwo = new Car ("Audi Q7", "white", 75000);
        Car carThree= new Car ("Volvo XC 60 ", "red", 50000);

        System.out.println("Car One:");
        System.out.println(carOne.getBrand());
        System.out.println(carOne.getColor());
        System.out.println(carOne.getPrice());

        carOne.setBrand("Porsche Panamera");
        System.out.println(carOne.getBrand());
        carOne.setColor("gold");
        System.out.println(carOne.getColor());
        carOne.setPrice(130000);
        System.out.println(carOne.getPrice());


        System.out.println("Car Two: ");
        System.out.println(carTwo.getBrand());
        System.out.println(carTwo.getColor());
        System.out.println(carTwo.getPrice());

        carTwo.setBrand("Audi Q8");
        System.out.println(carTwo.getBrand());
        carTwo.setColor("black");
        System.out.println(carTwo.getColor());
        carTwo.setPrice(90000);
        System.out.println(carTwo.getPrice());


        System.out.println("Car Three ");
        System.out.println(carThree.getBrand());
        System.out.println(carThree.getColor());
        System.out.println(carThree.getPrice());

        carThree.setBrand("Volvo XC 90");
        System.out.println(carThree.getBrand());
        carThree.setColor("brown");
        System.out.println(carThree.getColor());
        carThree.setPrice(60000);
        System.out.println(carThree.getPrice());

    }

}
