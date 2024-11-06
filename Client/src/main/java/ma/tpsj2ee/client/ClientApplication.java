package ma.tpsj2ee.client;

import ma.tpsj2ee.client.entities.Client;
import ma.tpsj2ee.client.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    CommandLineRunner initialiserBaseH2(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client(Long.parseLong("1"),"Bouzoubaa"," Fz", Float.parseFloat("30")));
            clientRepository.save(new Client(Long.parseLong("2"),"Kerdouss","AAAmine", Float.parseFloat("12")));
            clientRepository.save(new Client(Long.parseLong("3"),"Bouzoubaa","Hajar", Float.parseFloat("29")));

        };
    }
}
