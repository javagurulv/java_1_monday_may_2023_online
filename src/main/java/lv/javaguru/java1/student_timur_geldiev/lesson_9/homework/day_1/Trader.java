package lv.javaguru.java1.student_timur_geldiev.lesson_9.homework.day_1;

public class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String country, String city){
        this.fullName = fullName;
        this.country = country;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
