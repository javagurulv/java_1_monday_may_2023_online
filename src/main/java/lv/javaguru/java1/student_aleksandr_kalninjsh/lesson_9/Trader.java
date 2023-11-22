package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_9;

class Trader {

    private String fullName;
    private String country;
    private String city;

    public Trader(String fullName, String country, String city) {
        this.fullName = fullName;
        this.city = country;
        this.country = city;
    }

    String getFullName() {
        return fullName;
    }
    String getCountry() {
        return country;
    }
    String getCity() {
        return city;
    }
}
