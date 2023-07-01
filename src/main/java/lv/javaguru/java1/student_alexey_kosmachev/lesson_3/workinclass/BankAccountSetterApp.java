package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.workinclass;

class BankAccountSetterApp {
    public static void main(String[] args) {
        BankAccount alexBankAccount = new BankAccount("Alexey Kosmachev",1000);
        BankAccount viktorsBankAcoount = new BankAccount("Viktors Savonins", 2000);

        //alexBankAccount.owner = "Alexey Kosmachev";
        //alexBankAccount.moneyAmount = 5000;

        System.out.println("Alex Account values are: ");
        System.out.println(alexBankAccount.getOwner());
        System.out.println(alexBankAccount.getMoneyAmount());

        alexBankAccount.setMoneyAmount(500);
        System.out.println(alexBankAccount.getMoneyAmount());

        alexBankAccount.setOwner("Alex Doe");
        System.out.println(alexBankAccount.getOwner());

        System.out.println("Viktors Account");
        System.out.println(viktorsBankAcoount.getOwner());
        System.out.println(viktorsBankAcoount.getMoneyAmount());
    }
}
