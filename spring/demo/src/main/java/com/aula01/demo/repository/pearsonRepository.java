package com.aula01.demo.repository;

import org.springframework.stereotype.Repository;

public interface pearsonRepository {
    @Repository
    public interface pearsonRepository extends JpaRepository<pearson, long> {
        
        
    }
