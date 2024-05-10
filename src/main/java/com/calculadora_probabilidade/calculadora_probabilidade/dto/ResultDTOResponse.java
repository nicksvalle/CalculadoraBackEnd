package com.calculadora_probabilidade.calculadora_probabilidade.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResultDTOResponse {
    
    private Long id;

    private String resultSimples; 

    private String resultComposta; 

    private double res1;

    private double res2;

    private double res3; 

    private double res4; 
}
