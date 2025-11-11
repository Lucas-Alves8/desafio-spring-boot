package service;

import Repository.HouseRepositorio;
import model.House;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HouseService {

    private final HouseRepositorio repository;

    public HouseService(HouseRepositorio repository) {
        this.repository = repository;
    }

    public List<House> listAll(Optional<String> zipcode) {
    }

    public boolean delete(long id) {
    }
}
