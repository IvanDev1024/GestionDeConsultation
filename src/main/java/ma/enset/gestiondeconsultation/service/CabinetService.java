package ma.enset.gestiondeconsultation.service;

import ma.enset.gestiondeconsultation.entities.Consultation;
import ma.enset.gestiondeconsultation.entities.Patient;

import java.util.List;

public interface CabinetService {
    void savePatient(Patient patient);
    java.util.List<Patient> getAllPatient();
    Patient getPatientById(Long id);

    List<Patient> getAllPatients();

    void deletePatient(Patient patient);
    void deletePatientsById(Long id);

    void addConsultation(Consultation consultation);
    java.util.List<Consultation> getAllConsultations();

    void deletePatientById(Long id);
}
