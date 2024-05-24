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

    @Column(name = "num1")
    private double num1;

    @Column(name = "num2")
    private double num2;

    @Column(name = "media") 
    private double media;

    @Column(name = "variancia") 
    private double variancia;

    @Column(name = "desvio_padrao")
    private double desvioPadrao;

}
