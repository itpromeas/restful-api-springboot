package com.meas.malaika1.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Ange",
                        "ange@gmail.com",
                        35,
                        LocalDate.of(1987, Month.NOVEMBER, 30)
                ),

                new Student(
                        2L,
                        "Salome",
                        "salome@gmail.com",
                        30,
                        LocalDate.of(2016, Month.JANUARY, 03)
                )
        );
    }

}
