package ma.enset.gestiondeconsultation.entities;

import jakarta.persistence.*;
import lombok.*;


import java.sql.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

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

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public List<Consultation> getConsultations() {
        return Consultations;
    }

    public void setConsultations(List<Consultation> consultations) {
        Consultations = consultations;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "Id=" + Id +
                ", Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Email='" + Email + '\'' +
                ", Tel='" + Tel + '\'' +
                ", Consultations=" + Consultations +
                '}';
    }

    /*public Patient(Long id, String nom, String prenom, String email, String tel, List<Consultation> consultations) {
        Id = id;
        Nom = nom;
        Prenom = prenom;
        Email = email;
        Tel = tel;
        Consultations = consultations;
    }

    public Patient() {
    } */
}
