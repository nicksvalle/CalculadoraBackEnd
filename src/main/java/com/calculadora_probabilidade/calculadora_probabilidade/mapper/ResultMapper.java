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
            resultEntity.setResult(resultDTORequest.getResult());
            resultEntity.setRes1(resultDTORequest.getRes1());
            resultEntity.setRes2(resultDTORequest.getRes2());
        return resultEntity;
    }

    public static ResultDTOResponse toDTO(ResultEntity resultEntity){
        return new ResultDTOResponse(
            resultEntity.getId(),
            resultEntity.getResult(),
            resultEntity.getRes1(),
            resultEntity.getRes2()
        );
    }

    public static List<ResultDTOResponse> toDTOList(List<ResultEntity> resultsEntity){
        return resultsEntity.stream()
            .map(ResultMapper::toDTO)
            .collect(Collectors.toList());
    }
}
