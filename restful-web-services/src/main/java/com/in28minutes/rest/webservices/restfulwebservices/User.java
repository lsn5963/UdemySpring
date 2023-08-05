package com.in28minutes.rest.webservices.restfulwebservices;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class User {
    private int id;
    private String name;
    private LocalDate birthDate;
}
