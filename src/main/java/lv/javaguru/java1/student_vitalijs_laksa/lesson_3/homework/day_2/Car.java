package lv.javaguru.java1.student_vitalijs_laksa.lesson_3.homework.day_2;

public class Car {

    String model;
    String color;
    int price;

    public Car(String make, String color, int price){
        this.model = make;
        this.color = color;
        this.price = price;
    }
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String brand) {
        this.model = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
