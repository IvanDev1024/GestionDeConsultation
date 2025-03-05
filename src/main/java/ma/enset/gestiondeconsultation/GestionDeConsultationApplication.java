package ma.enset.gestiondeconsultation;

import ma.enset.gestiondeconsultation.entities.Consultation;
import ma.enset.gestiondeconsultation.entities.Patient;
import ma.enset.gestiondeconsultation.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ExecutableUpdateOperation;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class GestionDeConsultationApplication implements CommandLineRunner {

    private final ExecutableUpdateOperation executableUpdateOperation;
    private PatientRepository patientRepository;

    public GestionDeConsultationApplication(PatientRepository patientRepository, ExecutableUpdateOperation executableUpdateOperation) {
        this.patientRepository = patientRepository;
        this.executableUpdateOperation = executableUpdateOperation;
    }

    public static void main(String[] args) {
        SpringApplication.run(GestionDeConsultationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Patient patient = new Patient();
        patient.setId(1L);
        patient.setNom("Malayka");
        patient.setPrenom("Mustermann");
        patient.setEmail("mustermann@gmail.com");
        patient.setTel("123456789");

        patientRepository.save(patient);


        Consultation consultation = new Consultation();
        Date date = new Date(System.currentTimeMillis());
        consultation.setDateCons(date);
        consultation.setTarif(123);
        consultation.setIdCons(12L);
        consultation.setDescriptionCons("Description de la consultation");
    }
}
