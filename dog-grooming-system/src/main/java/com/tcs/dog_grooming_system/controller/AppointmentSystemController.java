package com.tcs.dog_grooming_system.controller;

import com.tcs.dog_grooming_system.model.AppointmentSystem;
import com.tcs.dog_grooming_system.service.AppointmentSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointment")
public class AppointmentSystemController {

    @Autowired
    private AppointmentSystemService appointmentSystemService;

    @PostMapping
    public ResponseEntity<AppointmentSystem> createAppointment(@RequestBody AppointmentSystem dogName) {
        return new ResponseEntity<>(appointmentSystemService.saveNameDog(dogName), HttpStatus.CREATED);
    }

    @GetMapping
    public List<AppointmentSystem> getAllDogs() {
        return appointmentSystemService.getAllNames();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AppointmentSystem> getDogById(@PathVariable Long id) {
        return appointmentSystemService.getDogById(id)
                .map(dogName -> new ResponseEntity<>(dogName, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AppointmentSystem> updateDog(@PathVariable Long id, @RequestBody AppointmentSystem updateDog) {
        return appointmentSystemService.getDogById(id).map(existingDog -> {
                    existingDog.setDogsName((updateDog.getDogsName()));
                    existingDog.setOwnersNumber(updateDog.getOwnersNumber());
                    existingDog.setBathType(updateDog.getBathType());
                    return new ResponseEntity<>(appointmentSystemService.saveNameDog(existingDog), HttpStatus.OK);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDog(@PathVariable Long id){
        appointmentSystemService.deleteName(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
