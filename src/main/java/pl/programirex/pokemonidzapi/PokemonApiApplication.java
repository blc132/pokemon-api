package pl.programirex.pokemonidzapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(basePackages="pl.programirex.pokemonidzapi")
public class PokemonApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokemonApiApplication.class, args);
    }

}
