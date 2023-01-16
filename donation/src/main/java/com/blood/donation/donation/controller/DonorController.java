package com.blood.donation.donation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blood.donation.donation.entity.Donor;
import com.blood.donation.donation.repository.DonorRepo;

@RestController
public class DonorController {
    @Autowired
    DonorRepo donorRepo;

    @GetMapping("/donors")
    public List<Donor> getDonor(){
        return donorRepo.findAll();
    }
    @PostMapping("/donor")
    public Donor addDonor(@RequestBody Donor donor){
        return donorRepo.save(donor);
    }
}
