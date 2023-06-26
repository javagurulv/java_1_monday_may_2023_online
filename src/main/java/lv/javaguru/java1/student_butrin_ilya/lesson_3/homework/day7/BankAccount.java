package lv.javaguru.java1.student_butrin_ilya.lesson_3.homework.day7;

class BankAccount {

    String owner;
    int moneyAmound;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.moneyAmound = moneyAmount;
    }

    String getOwner() {
        return owner;
    }

    String getMoney() {

        this.moneyAmound = moneyAmound;
            String moneyString = Integer.toString(moneyAmound);
        return moneyString;

    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        String moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }

}
