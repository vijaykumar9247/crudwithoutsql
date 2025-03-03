package com.example.crudwithsql.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudwithsql.entity.StudentEntity;
import com.example.crudwithsql.repo.StudRepo;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class Controller {
	@Autowired
    StudRepo sr;
	@PostMapping
	public String post(@RequestBody StudentEntity se) {
		sr.save(se);
		System.out.println(se);
		return "posted";
	}
	
	@GetMapping
	public List<StudentEntity> getstudents() {
		List<StudentEntity> se=sr.findAll();
		return se;
	}
	@GetMapping(path="/{id}")
	public Optional<StudentEntity>getstudent(@PathVariable Long id) {
		return sr.findById(id);
	}
	@DeleteMapping(path="/{id}")
	public String delete(@PathVariable Long id) {
		 sr.deleteById(id);
		 return "deleted";
	}
	@PutMapping("path/{id}")
	public String putMethodName(@PathVariable String id, @RequestBody String entity) {
	  
		
		return entity;
	}
}
