package com.pushpa.patients.Controller;

import com.pushpa.patients.Entity.Patient;
import com.pushpa.patients.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {
    @Autowired
    private final PatientRepository patientRepository;

    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }



    @GetMapping("/api/patients")
    public Iterable<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @PostMapping("/api/patients")

    public Patient createPatient(@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }

    @GetMapping("api/patients/{id}")

    public Patient getPatientById(@PathVariable Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Patient not found"));
    }

    @PutMapping("api/patients/{id}")

    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient updatedPatient) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Patient not found"));
        // Update patient fields here
        patient.setName(updatedPatient.getName());
        patient.setContact(updatedPatient.getContact());
        patient.setAddress(updatedPatient.getAddress());
        patient.setPincode(updatedPatient.getPincode());
        return patientRepository.save(patient);
    }

    @DeleteMapping("api/patients/{id}")

    public void deletePatient(@PathVariable Long id) {
        patientRepository.deleteById(id);
    }

}
