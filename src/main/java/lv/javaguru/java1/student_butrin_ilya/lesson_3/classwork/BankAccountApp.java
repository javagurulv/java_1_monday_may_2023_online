package lv.javaguru.java1.student_butrin_ilya.lesson_3.classwork;

import lv.javaguru.java1.student_timur_geldiev.lesson_3.classwork.BankAccount;

 class BankAccountApp {
    public static void main(String[] args) {


        BankAccount ilya = new BankAccount("ilya", 3999);
        BankAccount andrey = new BankAccount("Andrey", 453);
        ilya.setOwner("Butrin");
        ilya.setAmountOfMoney(3000);
        System.out.println(ilya.getAmountOfMoney());
        System.out.println(ilya.getOwner());
    }
}