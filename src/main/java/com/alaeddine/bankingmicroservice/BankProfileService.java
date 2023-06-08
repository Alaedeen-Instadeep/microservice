package com.alaeddine.bankingmicroservice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
class BankProfileService {
    private final BankProfileRepository repository;

    public List<BankProfile> findAll() {
        return repository.findAll();
    }

    public BankProfile save(BankProfile bankProfile) {
        return repository.save(bankProfile);
    }

    public Optional<BankProfile> findOne(Long id) {
        return repository.findById(id);
    }

    public void delete(BankProfile bankProfile) {
        repository.delete(bankProfile);
    }
}
