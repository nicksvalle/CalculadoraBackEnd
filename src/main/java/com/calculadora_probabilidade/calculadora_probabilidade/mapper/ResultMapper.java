package com.calculadora_probabilidade.calculadora_probabilidade.mapper;

import java.util.List;
import java.util.stream.Collectors;


import com.calculadora_probabilidade.calculadora_probabilidade.dto.ResultDTORequest;
import com.calculadora_probabilidade.calculadora_probabilidade.dto.ResultDTOResponse;
import com.calculadora_probabilidade.calculadora_probabilidade.entity.ResultEntity;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ResultMapper {
    
    public static ResultEntity toEntity(ResultDTORequest resultDTORequest){
        ResultEntity resultEntity = new ResultEntity();
            resultEntity.setMedia(resultDTORequest.getMedia());
            resultEntity.setVariancia(resultDTORequest.getVariancia());
            resultEntity.setDesvioPadrao(resultDTORequest.getDesvioPadrao());
        return resultEntity;
    }

    public static ResultDTOResponse toDTO(ResultEntity resultEntity){
        return new ResultDTOResponse(
            resultEntity.getId(),
            resultEntity.getNumeros(),
            resultEntity.getMedia(),
            resultEntity.getVariancia(),
            resultEntity.getDesvioPadrao()
        );
    }

    public static List<ResultDTOResponse> toDTOList(List<ResultEntity> resultsEntity){
        return resultsEntity.stream()
            .map(ResultMapper::toDTO)
            .collect(Collectors.toList());
    }
}
