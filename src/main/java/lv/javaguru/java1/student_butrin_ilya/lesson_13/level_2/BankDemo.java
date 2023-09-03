package lv.javaguru.java1.student_butrin_ilya.lesson_13.level_2;


import java.util.List;
import java.util.Optional;

public class BankDemo {
    public static void main(String[] args)
        throws NoAccessEception{
BankData bankData = new BankData((List.of(new BankClient("124", "butrin"),
        new BankClient("123", "pupkin"))));
UserCredentials user1 = new UserCredentials((List.of(Role.CAN_NOT_SEARCH_CLIENT)));
UserCredentials user2 = new UserCredentials((List.of(Role.CAN_NOT_SEARCH_CLIENT, Role.CAN_SEARCH_CLIENT)));

try {
    Optional<BankClient> clientOpt = bankData.findByUid(user2, "123");

    if (clientOpt.isEmpty())
        System.out.println("такого клиента в базе нет.");
    else {
        BankClient client = clientOpt.get();
        System.out.println(client.getFullName());
    }
}
catch (NoAccessEception exeption){
    System.out.println(exeption.getMessage());
}

    }
}

