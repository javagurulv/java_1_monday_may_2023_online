package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.lessoncode;
//task 6
class BankAccountAppSetter {

    public static void main(String[] args) {
        BankAccount alexBankAccount = new BankAccount("Alex Ivanov", 1000);
        BankAccount viktorsBankAccount = new BankAccount("Viktors Savonins", 2000000);

        System.out.println("Alex Account values are:");
        System.out.println(alexBankAccount.getOwner());
        System.out.println(alexBankAccount.getMoneyAmount());

        alexBankAccount.setMoneyAmount(500);
        System.out.println(alexBankAccount.getMoneyAmount());

        alexBankAccount.setOwner("Alex Doe");
        System.out.println(alexBankAccount.getOwner());
    }
}
