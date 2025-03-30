package com.alltour.selectour.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class RendezVous {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User client;

    @ManyToOne
    private AgentVoyage agentVoyage;

    private LocalDateTime dateHeure;
    private String statut; // en attente, confimé, annulé
}
