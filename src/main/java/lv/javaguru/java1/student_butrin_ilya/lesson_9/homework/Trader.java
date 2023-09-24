package lv.javaguru.java1.student_butrin_ilya.lesson_9.homework;

public class Trader {
    private String fullName;
    private City city;

    public Trader(String fullName, City city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public City getCity() {
        return city;
    }
}