package com.calculadora_probabilidade.calculadora_probabilidade.useCases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calculadora_probabilidade.calculadora_probabilidade.entity.ResultEntity;
import com.calculadora_probabilidade.calculadora_probabilidade.repository.ResultRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ResultUseCase {
    
    @Autowired
    ResultRepository resultRepository;

    public List<ResultEntity> getAll() {
        return this.resultRepository.findAll();
    }

    public void update(long id, ResultEntity resultEntity) {

        try {
            var updateResult = this.resultRepository.getReferenceById(id);
            updateResult.setResult(resultEntity.getResult());
            updateResult.setRes1(resultEntity.getRes1());
            updateResult.setRes2(resultEntity.getRes2());
        } catch (EntityNotFoundException e) {
            throw new EntityNotFoundException("Result not found");
        }
    }
}
