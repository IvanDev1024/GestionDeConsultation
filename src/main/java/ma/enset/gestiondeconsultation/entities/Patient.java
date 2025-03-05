package ma.enset.gestiondeconsultation.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Entity
@Data

public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(length=100,nullable=false)
    private String Nom;
    @Column(length=100,nullable=false)
    private String Prenom;
    @Column(length=30)
    private String Email;
    @Column(length=20)
    private String Tel;

    @OneToMany(mappedBy = "Patient", cascade = CascadeType.ALL)
    private List<Consultation> Consultations;

}
