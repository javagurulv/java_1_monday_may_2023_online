package lv.javaguru.java1.student_butrin_ilya.lesson_3.homework.day5;

class Car {

    String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel () {
        return model;
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}
