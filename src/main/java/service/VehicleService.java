package service;

import Repository.VehicleRepositorio;

public class VehicleService {

    private final VehicleRepositorio repository;

    public VehicleService(VehicleRepositorio repository) {
        this.repository = repository;
    }
}
