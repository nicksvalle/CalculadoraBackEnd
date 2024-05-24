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
            var updateResult = this.resultRepository.findById(id)
                                    .orElseThrow(() -> new EntityNotFoundException("Result not found"));
            updateResult.setMedia(resultEntity.getMedia()); 
            updateResult.setVariancia(resultEntity.getVariancia()); 
            updateResult.setDesvioPadrao(resultEntity.getDesvioPadrao());
            this.resultRepository.save(updateResult);
        } catch (EntityNotFoundException e) {
            throw new EntityNotFoundException("Result not found");
        }
    }
}
