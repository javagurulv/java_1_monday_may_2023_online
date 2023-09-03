package lv.javaguru.java1.student_butrin_ilya.lesson_13.level_2;

import java.util.List;
import java.util.Optional;

public class BankData implements BankApi {

    List<BankClient> BankClients;

    public BankData(List<BankClient> clients) {
        BankClients = clients;
    }

    public List<BankClient> getClients() {
        return BankClients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials, String uid)
            throws NoAccessEception {
        List<BankClient> clients = getClients();
        boolean isRoleCanSearchClient = false;
        for (int i = 0; i<credentials.getRoles().size(); i++)
        {Role role = credentials.getRoles().get(i);
            if (role.name().equals("CAN_SEARCH_CLIENT"))
                isRoleCanSearchClient = true;}

        if (!isRoleCanSearchClient) {
            NoAccessEception exeption = new NoAccessEception("У вас нет доступа к базе данных");
            throw exeption;
        }
            for (BankClient client: clients){
                if (uid.equals(client.getUid()))
                    return Optional.of(client);
                }
            return Optional.empty();
                }
            }


