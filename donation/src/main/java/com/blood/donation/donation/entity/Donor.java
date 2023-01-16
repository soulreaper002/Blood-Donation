package com.blood.donation.donation.entity;

import java.util.Date;

import jakarta.persistence.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Donor {
        @Id
        @Column(name = "donor_id", unique = true, nullable = false)
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String name;
        private String bloodGroup;
        private String sex;
        private Date dob;
       
        
}
