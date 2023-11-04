package com.pushpa.patients.Repository;


import com.pushpa.patients.Entity.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Long> {
}
