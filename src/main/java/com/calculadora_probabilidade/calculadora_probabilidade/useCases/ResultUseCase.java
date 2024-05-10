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
            updateResult.setResultSimples(resultEntity.getResultSimples()); // Alteração: Renomeando o método set
            updateResult.setResultComposta(resultEntity.getResultComposta()); // Adição: definindo o novo campo
            updateResult.setRes1(resultEntity.getRes1());
            updateResult.setRes2(resultEntity.getRes2());
            updateResult.setRes3(resultEntity.getRes3()); // Adição: definindo o novo campo
            updateResult.setRes4(resultEntity.getRes4()); // Adição: definindo o novo campo
            this.resultRepository.save(updateResult);
        } catch (EntityNotFoundException e) {
            throw new EntityNotFoundException("Result not found");
        }
    }
}
