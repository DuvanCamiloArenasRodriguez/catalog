package com.example.domainarquitecture.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "response_catalogs")
public class ResponseCatalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "response_option")
    private int response_option;

    @Column(name = "catalog_id")
    @ManyToOne
    private Catalog catalogId;

    @Column(name = "question_id")
    @ManyToOne
    private Question questionId;

    @Column(name = "response_id")
    @ManyToOne
    private Response responseId;

    @Column(name = "reponse_text")
    private String responseText;
}
