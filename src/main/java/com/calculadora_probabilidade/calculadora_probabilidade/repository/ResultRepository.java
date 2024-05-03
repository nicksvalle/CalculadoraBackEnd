package com.calculadora_probabilidade.calculadora_probabilidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calculadora_probabilidade.calculadora_probabilidade.entity.ResultEntity;

public interface ResultRepository extends JpaRepository<ResultEntity, Long>{
    
}
