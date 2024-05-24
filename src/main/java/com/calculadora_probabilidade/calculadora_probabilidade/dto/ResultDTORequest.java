package com.calculadora_probabilidade.calculadora_probabilidade.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResultDTORequest {
    
    private double media;

    private double variancia;

    private double desvioPadrao;

    private double num1;

    private double num2;
}
