package lv.javaguru.java1.student_timur_geldiev.lesson_13.homework.day_2;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid (UserCredentials credentials, String uid) throws AccessDeniedException;

}
