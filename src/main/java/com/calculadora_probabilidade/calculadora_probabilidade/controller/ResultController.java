package com.calculadora_probabilidade.calculadora_probabilidade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculadora_probabilidade.calculadora_probabilidade.dto.ResultDTOResponse;
import com.calculadora_probabilidade.calculadora_probabilidade.entity.ResultEntity;
import com.calculadora_probabilidade.calculadora_probabilidade.mapper.ResultMapper;
import com.calculadora_probabilidade.calculadora_probabilidade.repository.ResultRepository;
import com.calculadora_probabilidade.calculadora_probabilidade.useCases.ResultUseCase;

@RestController
@RequestMapping("/calculator")
@CrossOrigin
public class ResultController {
    
    @Autowired
    ResultRepository repository;

    @Autowired
    ResultUseCase resultUseCase;

    @PostMapping("/")
    public ResultEntity create(@RequestBody ResultEntity resultEntity) {
        return this.repository.save(resultEntity);
    }

    @GetMapping("/")
    public ResponseEntity<List<ResultDTOResponse>> getResult() {
        
        var results = this.resultUseCase.getAll();
        return ResponseEntity.ok(ResultMapper.toDTOList(results));
    }
}
