package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.homework.day_4;

class Patient {
    String firstNameLastName;
    String diagnose;
    String price;

    public Patient (String firstNameLastName, String diagnose, String price){
        this.firstNameLastName = firstNameLastName;
        this.diagnose = diagnose;
        this.price = price;
    }

    public String getFirstNameLastName() {return firstNameLastName;}
    public String getDiagnose() {return diagnose;}
    public String getPrice() {return price;}

}
