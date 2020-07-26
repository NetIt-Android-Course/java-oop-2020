package com.teo.data;

import com.teo.data.models.Admin;
import com.teo.data.models.Client;
import com.teo.data.models.User;

import java.util.ArrayList;
import java.util.List;

public class ClientRepository {

    private static final ClientRepository instance = new ClientRepository();

    public static ClientRepository getInstance() {
        return instance;
    }

    private final List<Client> clients;

    private ClientRepository() {
        clients = new ArrayList<>();
        clients.add(new Client("Google", "Google Maps", System.currentTimeMillis()));
    }

    public List<Client> getClients() {
        return clients;
    }

    public void createClient(Client client) {
        clients.add(client);
    }

    public Client getClientByName(String clientName) {
        for (Client client : clients) {
            if(clientName.equals(client.getName())) return client;
        }
        return null;
    }
}
