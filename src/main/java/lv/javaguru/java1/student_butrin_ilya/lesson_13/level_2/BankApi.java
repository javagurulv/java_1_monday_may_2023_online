package lv.javaguru.java1.student_butrin_ilya.lesson_13.level_2;

import java.util.Optional;

public interface BankApi {

        Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws NoAccessEception;
    }

