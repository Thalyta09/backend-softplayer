package com.tconrado.softplayers.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Data
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String gender;
    private String email;
    @JsonFormat(pattern="dd/MM/yyyy")
    @Column(nullable = false)
    private LocalDate birth_date;
    private String naturality;
    private String nationality;
    @Column(nullable = false)
    private String cpf;
    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp creation_date;
    @UpdateTimestamp
    private Timestamp last_update;

    public Player (){
    }

    public Player(
            Long id,
            String name,
            String gender,
            String email,
            LocalDate birth_date,
            String naturality,
            String nationality,
            String cpf
    ) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.birth_date = birth_date;
        this.naturality = naturality;
        this.nationality = nationality;
        this.cpf = cpf;
    }

    public Player updateWith (Player atlPlayer) {
        return new Player(
                this.id,
                atlPlayer.name,
                atlPlayer.gender,
                atlPlayer.email,
                atlPlayer.birth_date,
                atlPlayer.naturality,
                atlPlayer.nationality,
                atlPlayer.cpf
        );
    }
}
