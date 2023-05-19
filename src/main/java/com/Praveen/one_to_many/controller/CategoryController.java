package com.Praveen.one_to_many.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Praveen.one_to_many.entity.Category;
import com.Praveen.one_to_many.entity.Product;
import com.Praveen.one_to_many.repository.CategoryRepo;
@RestController
public class CategoryController {
	@Autowired
    private CategoryRepo categoryRepo;
 
  //pagination/Selecting
    @GetMapping("/category/{pageNo}/{pageSize}")
    public List<Category> getPaginated(@PathVariable int pageNo,
    @PathVariable int pageSize) {
    return getPaginated(pageNo, pageSize);
    }
  //select  
    @GetMapping("/category/{Id}/comments")
    public Page<Category> getAllCommentsById(@PathVariable (value = "Id") Long Id,Pageable pageable) {
        return categoryRepo.findAll(pageable);
    }
  //insert
    @PostMapping("/category")
    public ResponseEntity<Product> createUser(@RequestBody Product user){
    	Product savedUser = new Product();
    return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
     
    }
