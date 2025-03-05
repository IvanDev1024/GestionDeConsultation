package ma.enset.gestiondeconsultation.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
@Entity
@Data
public class Consultation {
    @Id //Pour faire de IdCons un clé étrangère
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Pour l'auto-incrémentation
    private Long IdCons;
    private Date DateCons;
    private String DescriptionCons;
    private float Tarif;
    @ManyToOne
    private Patient Patient;
}
