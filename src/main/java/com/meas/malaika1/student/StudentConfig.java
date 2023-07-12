package com.meas.malaika1.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student ange = new Student(
                    "Ange",
                    "ange@gmail.com",
                    LocalDate.of(1987, Month.NOVEMBER, 30)
            );

            Student salome = new Student(
                    "Salome",
                    "salome@gmail.com",
                    LocalDate.of(2016, Month.JANUARY, 03)
            );

            repository.saveAll(
                    List.of(ange, salome)
            );
        };
    }
}
