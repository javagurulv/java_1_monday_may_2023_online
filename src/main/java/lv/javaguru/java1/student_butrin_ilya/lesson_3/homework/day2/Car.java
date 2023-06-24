package lv.javaguru.java1.student_butrin_ilya.lesson_3.homework.day2;

 class Car {
    private String type;
    private String color;
    private int price;

    public Car(String type, String color, int price) {
        this.type  = type;
        this.color = color;
        this.price = price;

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
    public void setType(String type){
        this.type = type;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPrice(int price){
        this.price = price;
    }
}