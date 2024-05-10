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
            resultEntity.setResultSimples(resultDTORequest.getResultSimples());
            resultEntity.setResultComposta(resultDTORequest.getResultComposta());
            resultEntity.setRes1(resultDTORequest.getRes1());
            resultEntity.setRes2(resultDTORequest.getRes2());
            resultEntity.setRes3(resultDTORequest.getRes3());
            resultEntity.setRes4(resultDTORequest.getRes4());
        return resultEntity;
    }

    public static ResultDTOResponse toDTO(ResultEntity resultEntity){
        return new ResultDTOResponse(
            resultEntity.getId(),
            resultEntity.getResultSimples(),
            resultEntity.getResultComposta(),
            resultEntity.getRes1(),
            resultEntity.getRes2(),
            resultEntity.getRes3(),
            resultEntity.getRes4()
        );
    }

    public static List<ResultDTOResponse> toDTOList(List<ResultEntity> resultsEntity){
        return resultsEntity.stream()
            .map(ResultMapper::toDTO)
            .collect(Collectors.toList());
    }
}
