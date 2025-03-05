package ma.enset.gestiondeconsultation.service;

import ma.enset.gestiondeconsultation.entities.Consultation;
import ma.enset.gestiondeconsultation.entities.Patient;
import org.hibernate.mapping.List;

public interface CabinetService {
    void addPatient(Patient patient);
    java.util.List<Patient> getAllPatient();

    java.util.List<Patient> getAllPatients();

    void updatePatient(Patient patient);
    void deletePatient(Patient patient);

    void addConsultation(Consultation consultation);
    java.util.List<Consultation> getAllConsultations();

}
