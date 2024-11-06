package ma.tpsj2ee.service_voiture.repositories;

import ma.tpsj2ee.service_voiture.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture,Long> {
}
