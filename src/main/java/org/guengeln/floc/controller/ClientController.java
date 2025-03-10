package org.guengeln.floc.controller;

import java.util.List;

import org.guengeln.floc.model.Client;
import org.guengeln.floc.service.ClientService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clients")
@CrossOrigin(origins = "http://localhost:3000")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping("/create")
    public Client createClient() {
        Client client = new Client();
        client.setActive(true);
        client.setName("Jane Doe");
        client.setParcel(2);
        client.setAddress("Güngelstr. 1337 01234 Musterstadt");
        client.setPhone("0002/00000002");
        client.setWaterlevel_old(20.3f);
        client.setWaterlevel_new(23.5f);
        client.setCosts(4.63f);

        return clientService.saveClient(client);
    }

    @RequestMapping("/getAll")
    public List<Client> getClients() {
        return clientService.getAllClients();
    }

}
