package ma.enset.gestiondeconsultation.repositories;

import ma.enset.gestiondeconsultation.entities.Consultation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultationRepository extends CrudRepository<Consultation, Long> {
}
