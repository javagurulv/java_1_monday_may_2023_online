package lv.javaguru.java1.student_timur_geldiev.lesson_3.homework.day4;

public class Registration {

    String nameLastName;
    String diagnosis;
    double price;
    public Registration(String nameLastName, String diagnosis, double price){
        this.nameLastName = nameLastName;
        this.diagnosis = diagnosis;
        this.price = price;
    }

    public String getNameLastName() {
        return nameLastName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public double getPrice() {
        return price;
    }
}
