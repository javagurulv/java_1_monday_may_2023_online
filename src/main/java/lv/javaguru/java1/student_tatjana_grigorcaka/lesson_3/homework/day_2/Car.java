package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.homework.day_2;

class Car {

    private String brand;
    private String color;
    private int price;

    public Car(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }


    public String getBrand() {return brand;}

    public void setBrand(String brand) {this.brand = brand;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public double getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

}
