package com.book_store.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;
    private String name;
    private LocalDate dateOfBirth;
    private Boolean gender;
    private String address;
    private String job;
    private Boolean married;

    @Column(columnDefinition = "TEXT")
    private String avatar;

    private LocalDate joinDay;
    private Integer coin;

    @JsonBackReference(value = "user_account")
    @OneToOne(mappedBy = "user")
    private Account account;

}
