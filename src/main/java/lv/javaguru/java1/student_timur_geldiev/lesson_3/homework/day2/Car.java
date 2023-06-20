package lv.javaguru.java1.student_timur_geldiev.lesson_3.homework.day2;

public class Car {

    String brand;
    String color;
    double price;

    public Car(String brand, String color, double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
