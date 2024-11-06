package ma.tpsj2ee.client.repositories;

import ma.tpsj2ee.client.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {

}
