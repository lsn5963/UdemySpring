package com.in28minutes.rest.webservices.restfulwebservices.User;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString

@Entity(name = "user_details")
public class User {

    @Id
    @GeneratedValue
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
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Post> posts;
}
