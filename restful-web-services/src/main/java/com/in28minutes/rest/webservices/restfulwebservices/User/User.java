package com.in28minutes.rest.webservices.restfulwebservices.User;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    private Integer  id;
    @Size(min = 2)
    private String name;
    @Past(message = "Birth Date should be in the past")
    private LocalDate birthDate;


    public User(Integer id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
}
