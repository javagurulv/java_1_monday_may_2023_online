package lv.javaguru.java1.student_butrin_ilya.lesson_3.homework.day5;


    public class BankAccount {

        String ownerFirstName;
        String ownerLastName;
        int moneyAmount;

        public BankAccount (String ownerFirstName, String ownerLastName, int moneyAmount) {
            this.ownerFirstName = ownerFirstName;
            this.ownerLastName = ownerLastName;
            this.moneyAmount = moneyAmount;
        }

        public String getOwnerFirstName() {
            return ownerFirstName;
        }

        public String getOwnerLastName() {
            return ownerLastName;
        }

        public int getMoneyAmount() {
            return moneyAmount;
        }

    }

    class BankAccountDemo {

        public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount("Viktor", "Popov", 100000);
            String ownerFirstName = bankAccount.getOwnerFirstName();
            String ownerLastName = bankAccount.getOwnerLastName();
            int moneyAmount = bankAccount.getMoneyAmount();
            System.out.println("Owner first name = " + ownerFirstName);
            System.out.println("Owner last name = " + ownerLastName);
            System.out.println("Money amount = " + moneyAmount);
        }

    }

