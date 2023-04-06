package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student eya = new Student(
                    "eya",
                    "eyahaj@gmail.com",
                    LocalDate.of(2000, Month.APRIL,10),
                    22
            );
            Student alex = new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(2000, Month.APRIL,10),
                    25
            );

            repository.saveAll(
                    List.of(eya,alex));

        };

    }
}
