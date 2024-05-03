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

    private String result;

    private String res1;
    
    private String res2;
}
