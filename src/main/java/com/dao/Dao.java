package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Emp;

@Repository
public interface Dao extends JpaRepository<Emp, Long> {

}
