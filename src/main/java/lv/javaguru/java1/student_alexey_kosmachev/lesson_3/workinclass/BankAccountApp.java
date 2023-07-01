package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.workinclass;

class BankAccountApp {
    public static void main(String[] args) {
        BankAccount alexBankAccount = new BankAccount("Alexey Kosmachev",1000);
        BankAccount viktorsBankAcoount = new BankAccount("Viktors Savonins", 2000);

        //alexBankAccount.owner = "Alexey Kosmachev";
        //alexBankAccount.moneyAmount = 5000;

        System.out.println("Alex Account");
        System.out.println(alexBankAccount.getOwner());
        System.out.println(alexBankAccount.getMoneyAmount());

        System.out.println("Viktors Account");
        System.out.println(viktorsBankAcoount.getOwner());
        System.out.println(viktorsBankAcoount.getMoneyAmount());
    }
}
