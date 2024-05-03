package com.calculadora_probabilidade.calculadora_probabilidade.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "resultado")
public class ResultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "result")
    private String result;

    @Column(nullable = false, name = "res1")
    private String res1;

    @Column(nullable = false, name = "res2")
    private String res2;
}
