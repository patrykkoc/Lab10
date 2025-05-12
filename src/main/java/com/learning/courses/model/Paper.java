package com.learning.courses.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.ISBN;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
public class Paper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    String TypeOfPaper;

    @NotEmpty
    List<Person> Authors ;


    @ISBN(type = ISBN.Type.ISBN_13)
    String ISBN_;

    @NotBlank
    String Topic;

    @NotNull
     String Content;

}

