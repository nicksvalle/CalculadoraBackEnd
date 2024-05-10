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

    @Column(name = "resultsimples") 
    private String resultSimples;

    @Column(name = "resultcomposta") 
    private String resultComposta;

    @Column(name = "res1")
    private double res1;

    @Column(name = "res2")
    private double res2;

    @Column(name = "res3") 
    private double res3;

    @Column(name = "res4") 
    private double res4;
}
