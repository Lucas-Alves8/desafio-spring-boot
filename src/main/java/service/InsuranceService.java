package service;

import Repository.InsuranceRepositorio;

public class InsuranceService {

    private final InsuranceRepositorio repository;

    public InsuranceService(InsuranceRepositorio repository) {
        this.repository = repository;
    }
}
