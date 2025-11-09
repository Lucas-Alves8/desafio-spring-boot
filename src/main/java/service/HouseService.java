package service;

import Repository.HouseRepositorio;
import org.springframework.stereotype.Service;

@Service
public class HouseService {

    private final HouseRepositorio repository;

    public HouseService(HouseRepositorio repository) {
        this.repository = repository;
    }
}
