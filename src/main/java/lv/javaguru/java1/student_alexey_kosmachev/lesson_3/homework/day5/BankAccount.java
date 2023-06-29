package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day5;
//Найти ошибку в коде.
//Исправить и запустить программу.
public class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String ownerFirstName,
                String ownerLastName,  //запятая
                int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount; // название параметра на moneyAmount
    }

    String getOwnerFirstName(){  //закрывающая скобка
        return this.ownerFirstName; // точка с запятой
    }

    String getOwnerLastName() { // открывающая скобка
        return this.ownerFirstName; // точка с запятой
    }

    int getMoneyAmount() { //описание изменить на int
        return this.moneyAmount;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", "Popov", 100000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName();
        int moneyAmount = bankAccount.getMoneyAmount(); // описание изменить на int
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }

}
