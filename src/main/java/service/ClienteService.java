package service;

import Repository.ClienteRepositorio;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

   private final ClienteRepositorio repository;

    public ClienteService(ClienteRepositorio repository) {
        this.repository = repository;
    }
}
