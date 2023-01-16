package com.blood.donation.donation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blood.donation.donation.entity.Donor;

public interface DonorRepo extends JpaRepository<Donor,Long> {
    
}
