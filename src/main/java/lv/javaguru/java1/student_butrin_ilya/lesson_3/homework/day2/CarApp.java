package lv.javaguru.java1.student_butrin_ilya.lesson_3.homework.day2;

class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("opel", "red", 1000);
        Car car2 = new Car("ford", "blue", 2000);
        Car car3 = new Car("bmv", "green", 5000);
System.out.println("car1 type - " + car1.getType() + ", car 1 color - " + car1.getColor() + ", car1 price - " + car1.getPrice());
System.out.println("car2 type - " + car2.getType() + ", car 2 color - " + car2.getColor() + ", car2 price - " + car2.getPrice());
System.out.println("car3 type - " + car3.getType() + ", car 3 color - " + car3.getColor() + ", car3 price - " + car3.getPrice());
    car1.setType("NEW opel");
    car1.setColor("NEW red");
    car1.setPrice(30000000);
    car2.setType("NEW ford");
    car2.setColor("NEW blue");
    car2.setPrice(40000000);
    car3.setType("NEW bmv");
    car3.setColor("NEW green");
    car3.setPrice(500000000);
    System.out.println("car1 type - " + car1.getType() + ", car 1 color - " + car1.getColor() + ", car1 price - " + car1.getPrice());
    System.out.println("car2 type - " + car2.getType() + ", car 2 color - " + car2.getColor() + ", car2 price - " + car2.getPrice());
    System.out.println("car3 type - " + car3.getType() + ", car 3 color - " + car3.getColor() + ", car3 price - " + car3.getPrice());




    }
}
