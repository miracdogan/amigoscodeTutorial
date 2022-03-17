package com.example.amigoscode.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args ->  {
            Student mirac = new Student(
                    "Mirac",
                    "miracdogan@gmail.com",
                    LocalDate.of(1996, Month.MAY, 12),
                    25
            );

            Student alper = new Student(
                    "Alper",
                    "alperyesil@gmail.com",
                    LocalDate.of(1997, Month.APRIL, 12),
                    24
            );

            repository.saveAll(
                    List.of(mirac, alper)
            );
        };
    }
}
