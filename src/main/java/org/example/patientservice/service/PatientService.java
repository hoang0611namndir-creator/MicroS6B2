package org.example.patientservice.service;

import org.example.patientservice.entity.Patient;
import org.example.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient create(Patient patient) {
        patient.setId(null); // để DB tự sinh id
        return patientRepository.save(patient);
    }
}