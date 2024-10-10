package com.tcs.dog_grooming_system.repository;

import com.tcs.dog_grooming_system.model.AppointmentSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentSystemRepository extends JpaRepository<AppointmentSystem, Long> {

}
