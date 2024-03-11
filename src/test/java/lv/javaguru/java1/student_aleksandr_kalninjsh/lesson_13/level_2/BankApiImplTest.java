package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_13.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BankApiImplTest {

    public static void main(String[] args) {
        BankApiImplTest bankApiImplTest = new BankApiImplTest();
        bankApiImplTest.shouldThrowException();
    }

    public void shouldThrowException() {
        List<BankClient> clients = new ArrayList<>();
        BankApiImpl api = new BankApiImpl(clients);

        List<Role>roles = new ArrayList<>();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "20345");
            System.out.println("Test FAIL");
        }catch (AccessDeniedException e) {
            System.out.println("Test OK");
        }
    }

}