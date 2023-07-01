package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_5;
//Найти ошибку в коде.
//Исправить и запустить программу.
//Менять можно только класс Car.
class Car {
    String model;

    Car(String newModel) {
        this.model = newModel;
    }

    String getModel() { //Добавить кавычки после getNodel
        return this.model; // добавить точки с запятой в конце
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}
