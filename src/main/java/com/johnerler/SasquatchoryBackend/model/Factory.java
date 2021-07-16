package com.johnerler.SasquatchoryBackend.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="factory")
public class Factory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotEmpty(message = "Enter a valid name.")
    private String name;

    @NotEmpty(message = "Enter a min value")
    private Integer minValue;

    @NotEmpty(message = "Enter a max value")
    private Integer maxValue;

    private List<Integer> numbers;

    private Integer profile;
}
