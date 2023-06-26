package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_2;

public class Car {
    String type; //описание марки машины
    String colour; //описание цвета машины
    double price; //описание цены машины

    public Car(String Type, String Colour, double Price) {
        this.type = Type;
        this.colour = Colour;
        this.price = Price;
    }

    public String getType() { return type; }
    public void setType(String Type) {
        this.type = Type;
    }

    public String getColour() { return colour; }
    public void setColour(String Colour) {
        this.colour = Colour;
    }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        this.price = price;
    }





}
