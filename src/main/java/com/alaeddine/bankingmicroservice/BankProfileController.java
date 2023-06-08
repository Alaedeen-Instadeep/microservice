package com.alaeddine.bankingmicroservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bankprofiles")
@RequiredArgsConstructor
class BankProfileController {
    private final BankProfileService service;

    @GetMapping
    public List<BankProfile> findAll() {
        return service.findAll();
    }

    @PostMapping
    public BankProfile newBankProfile(@RequestBody BankProfile newBankProfile) {
        return service.save(newBankProfile);
    }

    @GetMapping("/{id}")
    public BankProfile findOne(@PathVariable Long id) {
        return service.findOne(id).get();
    }

    @DeleteMapping("/{id}")
    public void deleteBankProfile(@PathVariable Long id) {
        BankProfile bankProfile = service.findOne(id).get();
        service.delete(bankProfile);
    }

    @PutMapping("/{id}")
    public BankProfile replaceBankProfile(@RequestBody BankProfile newBankProfile, @PathVariable Long id) {
        return service.findOne(id)
                .map(bankProfile -> {
                    bankProfile.setName(newBankProfile.getName());
                    bankProfile.setAccountNumber(newBankProfile.getAccountNumber());
                    return service.save(bankProfile);
                })
                .orElseGet(() -> {
                    newBankProfile.setId(id);
                    return service.save(newBankProfile);
                });
    }
}
