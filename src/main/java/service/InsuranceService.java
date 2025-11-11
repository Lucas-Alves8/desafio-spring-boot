package service;

import Repository.InsuranceRepositorio;
import model.Insurance;

public class InsuranceService {

    private final InsuranceRepositorio repository;

    public InsuranceService(InsuranceRepositorio repository) {
        this.repository = repository;
    }

    public Insurance createInsuranVehicle(InsuranceVehicleDTO insuranceVehicleDTO) {
    }
}
