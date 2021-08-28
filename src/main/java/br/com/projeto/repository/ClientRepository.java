package br.com.projeto.repository;

import br.com.projeto.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository  extends MongoRepository<Client, String> {

}
