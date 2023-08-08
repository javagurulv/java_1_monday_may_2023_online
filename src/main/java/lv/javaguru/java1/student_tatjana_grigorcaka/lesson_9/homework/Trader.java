package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_9.homework;

class Trader {

    private String fullName;

    private String country;
    private String city;


    public Trader(String fullName, String country, String city) {
        this.fullName = fullName;
        this.country = country;
        this.city = city;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCity() {
        return this.city;
    }
}

