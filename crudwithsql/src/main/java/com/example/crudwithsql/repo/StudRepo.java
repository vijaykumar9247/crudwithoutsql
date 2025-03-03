package com.example.crudwithsql.repo;

import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudwithsql.entity.StudentEntity;

public interface StudRepo extends JpaRepository<StudentEntity,Long>{

}
