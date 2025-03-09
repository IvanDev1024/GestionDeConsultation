package ma.enset.gestiondeconsultation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Consultation {
    @Id //Pour faire de IdCons un clé étrangère
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Pour l'auto-incrémentation
    private Long IdCons;
    private Date DateCons;
    private String DescriptionCons;
    private float Tarif;
    @ManyToOne
    private Patient Patient;

    public Long getIdCons() {
        return IdCons;
    }

    public void setIdCons(Long idCons) {
        IdCons = idCons;
    }

    public Date getDateCons() {
        return DateCons;
    }

    public void setDateCons(Date dateCons) {
        DateCons = dateCons;
    }

    public String getDescriptionCons() {
        return DescriptionCons;
    }

    public void setDescriptionCons(String descriptionCons) {
        DescriptionCons = descriptionCons;
    }

    public float getTarif() {
        return Tarif;
    }

    public void setTarif(float tarif) {
        Tarif = tarif;
    }

    public Patient getPatient() {
        return Patient;
    }

    public void setPatient(Patient patient) {
        Patient = patient;
    }

    @Override
    public String  toString() {
        return "Consultation{" +
                "IdCons=" + IdCons +
                ", DateCons=" + DateCons +
                ", DescriptionCons='" + DescriptionCons + '\'' +
                ", Tarif=" + Tarif +
                ", Patient=" + Patient +
                '}';
    }

    /*public Consultation(Long idCons, Date dateCons, String descriptionCons, float tarif, ma.enset.gestiondeconsultation.entities.Patient patient) {
        IdCons = idCons;
        DateCons = dateCons;
        DescriptionCons = descriptionCons;
        Tarif = tarif;
        Patient = patient;
    }

    public Consultation() {
    }*/
}
