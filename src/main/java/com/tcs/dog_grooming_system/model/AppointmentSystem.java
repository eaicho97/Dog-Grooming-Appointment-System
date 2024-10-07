package com.tcs.dog_grooming_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AppointmentSystem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String dogsName;
    private Long ownersNumber;
    private String bathType;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDogsName() {
        return dogsName;
    }

    public void setDogsName(String dogsName) {
        this.dogsName = dogsName;
    }

    public Long getOwnersNumber() {
        return ownersNumber;
    }

    public void setOwnersNumber(Long ownersNumber) {
        this.ownersNumber = ownersNumber;
    }

    public String getBathType() {
        return bathType;
    }

    public void setBathType(String bathType) {
        this.bathType = bathType;
    }
}
