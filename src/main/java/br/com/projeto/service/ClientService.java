package br.com.projeto.service;

import br.com.projeto.model.Client;
import br.com.projeto.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @PostMapping()
    public void save(Client client){
        clientRepository.save(client);
    }

    public List<Client> findAll(){
        return clientRepository.findAll();
    }

    public Optional<Client> findById(String id){
        return clientRepository.findById(id) ;
    }

    public void deleteById(String id){
        clientRepository.deleteById(id);
    }



}
