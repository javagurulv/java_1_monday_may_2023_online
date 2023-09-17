package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_8.day_1;

import java.util.ArrayList;
import java.util.List;

public class CarStock {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", "series 3", "coupe", "petrol");
        Car car2 = new Car("BMW", "series 4", "coupe", "petrol");
        Car car3 = new Car("BMW", "series 5", "sedan", "diesel");
        Car car4 = new Car("BMW", "series 7", "sedan", "diesel");
        
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
    }
}
