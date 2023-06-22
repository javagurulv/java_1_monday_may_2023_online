package lv.javaguru.java1.student_butrin_ilya.lesson_3.homework.day2;

public class Car {
    String type;
    String color;
    int price;

    public Car(String x, String y, int z) {
        type  = x;
        color = y;
        price = z;

    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
    public void setType(String x){
        this.type = x;
    }
    public void setColor(String y){
        this.color = y;
    }
    public void setPrice(int z){
        this.price = z;
    }
}