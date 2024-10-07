package com.tcs.dog_grooming_system.service;

import com.tcs.dog_grooming_system.model.AppointmentSystem;
import com.tcs.dog_grooming_system.repository.AppointmentSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentSystemService {

    @Autowired
    private AppointmentSystemRepository appointmentSystemRepository;

    public AppointmentSystem saveNameDog(AppointmentSystem dogsName){
        return appointmentSystemRepository.save(dogsName);
    }

    public List<AppointmentSystem> getAllNames(){
        return appointmentSystemRepository.findAll();
    }

    public Optional<AppointmentSystem> getDogById(Long id){
        return appointmentSystemRepository.findById(id);
    }

    public void deleteName(Long id){
        appointmentSystemRepository.deleteById(id);
    }
}
