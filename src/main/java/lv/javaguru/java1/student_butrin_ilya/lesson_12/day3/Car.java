package lv.javaguru.java1.student_butrin_ilya.lesson_12.day3;

abstract class Car {

    abstract void accelerate();

}

class ElectricCar extends Car {

    private int batteryCharge;

public void accelerate(){
    }
}

class PetrolCar extends Car {

    private double petrolTankCapacity;
    public void accelerate(){
    }

}
