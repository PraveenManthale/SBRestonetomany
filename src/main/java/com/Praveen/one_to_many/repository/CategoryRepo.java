package com.Praveen.one_to_many.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Praveen.one_to_many.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, String> {

}