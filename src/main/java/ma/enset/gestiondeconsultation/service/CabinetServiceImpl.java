package ma.enset.gestiondeconsultation.service;

import ma.enset.gestiondeconsultation.entities.Consultation;
import ma.enset.gestiondeconsultation.entities.Patient;
import ma.enset.gestiondeconsultation.repositories.ConsultationRepository;
import ma.enset.gestiondeconsultation.repositories.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabinetServiceImpl implements CabinetService{
    private PatientRepository patientRepository;
    private ConsultationRepository consultationRepository;

    public CabinetServiceImpl(PatientRepository patientRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public void addPatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public List<Patient> getAllPatient() {
        return List.of();
    }

    @Override
    public java.util.List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public void updatePatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Patient patient) {
        patientRepository.delete(patient);
    }

    @Override
    public void addConsultation(Consultation consultation) {
        consultationRepository.save(consultation);
    }

    @Override
    public List<Consultation> getAllConsultations() {
        return (List<Consultation>) consultationRepository.findAll();
    }
}
