package lv.javaguru.java1.student_timur_geldiev.lesson_3.classwork;

public class BankAccount {

    private String owner;
    private int amountOfMoney;

    public void setOwner(String owner){
        this.owner = owner;
    }
    public void setAmountOfMoney(int amountOfMoney){
        this.amountOfMoney = amountOfMoney;

    }
    public BankAccount(String owner, int amountOfMoney){
       this.owner = owner;
       this.amountOfMoney = amountOfMoney;
    }
    public String getOwner(){
        return owner;
    }
    public int getAmountOfMoney(){
        return amountOfMoney;
    }


}
