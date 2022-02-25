package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.AUGUST;
import static java.time.Month.JUNE;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student dude = new Student(
                    "Dude",
                    "Dude.The@gmail.com",
                    LocalDate.of(420, JUNE, 9)
            );

            Student tony = new Student(
                    "Tony",
                    "Stark.Tony@gmail.com",
                    LocalDate.of(1969, AUGUST, 1)
            );

            repository.saveAll(
                    List.of(dude, tony)
            );
        };
    }
}
