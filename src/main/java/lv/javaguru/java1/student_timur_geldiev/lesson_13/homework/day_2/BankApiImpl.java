package lv.javaguru.java1.student_timur_geldiev.lesson_13.homework.day_2;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException{
        if(!credentials.hasRole(Role.CAN_SEARCH_CLIENTS)){
            throw new AccessDeniedException("Access denied for user with this role");
        }
        for (BankClient client : clients){
            if (client.getUid().equals(uid)){
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }
}
