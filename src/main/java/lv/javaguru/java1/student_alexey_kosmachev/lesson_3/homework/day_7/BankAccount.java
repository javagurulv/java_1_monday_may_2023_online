package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_7;

// Найти логическую ошибку в коде.
//Исправить и запустить программу так, что бы она выводила
//на консоль владельца банковского счёта и количество денег.
//Менять можно только класс BankAccount

    class BankAccount {
        String owner;
        int money;

        BankAccount(String owner, int money) {
            this.owner = owner;
            this.money = money;

        }

        String getOwner() {
            return this.owner;
        }

        String getMoney() {
            this.money = money;
                String MoneyString = Integer.toString(money);
            return MoneyString;
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

