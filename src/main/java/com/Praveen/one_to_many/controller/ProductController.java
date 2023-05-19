package com.Praveen.one_to_many.controller;

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
import com.Praveen.one_to_many.repository.ProductRepo;
@RestController
public class ProductController {
	@Autowired
    private CategoryRepo categoryRepo;
 
  //pagination/Selecting
    @GetMapping("/category/{pageNo}/{pageSize}")
    public Product getPaginated(@PathVariable int pageNo,
    @PathVariable int pageSize) {
    return getPaginated(pageNo, pageSize);
    }
  //insert
    @PostMapping("/category")
    public ResponseEntity<Category> createUser(@RequestBody Category user){
    	Category savedUser = new Category();
    return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
    
    
    }
