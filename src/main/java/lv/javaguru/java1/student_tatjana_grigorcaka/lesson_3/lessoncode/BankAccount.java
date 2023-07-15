package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.lessoncode;

//task 1-6
class BankAccount {
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


    //setter&getter
    public String getOwner(){
    return owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public int getMoneyAmount() {
    return moneyAmount;
    }
    public void setMoneyAmount(int moneyAmount){
        this.moneyAmount = moneyAmount;
    }
}
