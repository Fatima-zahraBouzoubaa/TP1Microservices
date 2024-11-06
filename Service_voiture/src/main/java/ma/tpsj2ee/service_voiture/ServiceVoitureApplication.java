package ma.tpsj2ee.service_voiture;

import ma.tpsj2ee.service_voiture.entities.Client;
import ma.tpsj2ee.service_voiture.entities.Voiture;
import ma.tpsj2ee.service_voiture.repositories.VoitureRepository;
import ma.tpsj2ee.service_voiture.services.ClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
@EnableFeignClients
@SpringBootApplication
public class ServiceVoitureApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceVoitureApplication.class, args);
    }
    @Bean
    CommandLineRunner initDatabase(VoitureRepository voitureRepository, ClientService clientService) {
        return args -> {
            Client c1 = clientService.clientById(1L);
            Client c2 = clientService.clientById(2L);

            System.out.println("Id est :" + c2.getId());
            System.out.println("Nom est :" + c2.getNom());
            System.out.println("Age est :" + c2.getAge());
            System.out.println("********");
            System.out.println("Id est :" + c1.getId());
            System.out.println("Nom est :" + c1.getNom());
            System.out.println("Age est :" + c1.getAge());
            System.out.println("*******");
            voitureRepository.save(new Voiture(Long.parseLong("1"), "Toyota", "A 25 333", "Corolla", 1L, c1));
            voitureRepository.save(new Voiture(Long.parseLong("3"), "Peugeot", "A 55 777", "206", 2L, c2));


        };
    }}
