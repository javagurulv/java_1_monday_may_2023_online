package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_13.level_2;

import java.util.Optional;

public interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
