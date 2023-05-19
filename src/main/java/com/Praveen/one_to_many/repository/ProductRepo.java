package com.Praveen.one_to_many.repository;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Praveen.one_to_many.entity.Category;
import com.Praveen.one_to_many.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, String> {

    public Product findByProductId(int ProductId);

	public Page<Category> findAllById(Long id);

}
