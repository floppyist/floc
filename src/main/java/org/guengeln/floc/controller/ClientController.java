package org.guengeln.floc.controller;

import java.util.List;

import org.guengeln.floc.model.Client;
import org.guengeln.floc.service.ClientService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/create")
    public Client createClient(@RequestBody Client client) {
        return clientService.saveClient(client);
    }

    @RequestMapping("/getAll")
    public List<Client> getClients() {
        return clientService.getAllClients();
    }

}
