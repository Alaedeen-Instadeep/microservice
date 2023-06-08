package com.alaeddine.bankingmicroservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface BankProfileRepository extends JpaRepository<BankProfile, Long> {
}
