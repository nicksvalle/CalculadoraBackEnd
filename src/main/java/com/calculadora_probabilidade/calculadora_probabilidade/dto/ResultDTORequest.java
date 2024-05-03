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
    
    private String result;

    private double res1;

    private double res2;
}
