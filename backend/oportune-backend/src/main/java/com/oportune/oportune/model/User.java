package com.oportune.oportune.model;

import com.oportune.oportune.enums.Role;
import com.oportune.oportune.model.City;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    @SequenceGenerator(
            name="user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "user_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private int id;
    private String email;
    private String last_name;
    private String first_name;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(nullable = true)
    private String photo;

    @Column(nullable = true)
    private Integer phone;

    @ManyToOne
    private City city;

}
