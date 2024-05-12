package avm.repository;

import avm.products.Client;
import avm.products.Wallet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AIT-TR, cohort 42.1, Java Basic, Project AVM/General
 * @author Andrey Hein
 * @version Apr-2024
 */
public class ClientRepository {
    private Map<Integer, Client> clientMap;


    public ClientRepository() {
        clientMap = new HashMap<>();
    }

    public void put(Client client) {
        clientMap.put(client.getId(),client);
    }

    public Client get(int id) {
        return clientMap.get(id);
    }

    public void remove(int id) {
        clientMap.remove(id);
    }

    public void initClient() {
        List<Client> clients = new ArrayList<>(List.of(
                new Client("Alexander", 56, 1000),
                new Client("Andrey", 50, 1000),
                new Client("Valerian", 38, 1000),
                new Client("Mukhlis", 29, 1000),
                new Client("Rodion", 24, 1000),
                new Client("Sergey", 45, 1000)
        ));
        clients.forEach(client -> put(client));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nClient list: \n");
        clientMap.forEach((Integer, client) -> {
            sb.append(client).append("\n");
        });
        return sb.toString();
    }
}
