package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3;

//task 1-4
public class BankAccount {
    String owner;
    int moneyAmount;


    //default constructor
    public BankAccount(String newOwner, int newMoneyAmount) {
        owner = newOwner;
        moneyAmount = newMoneyAmount;
    }
    //public BankAccount(String owner, int moneyAmount) {
        //this.owner = owner;
        //this.moneyAmount = moneyAmount;
    //}

    //getter
    public String getOwner(){
    return owner;
    }
    public int getMoneyAmount() {
    return moneyAmount;
    }
}
