package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Category;

@Repository
@Transactional
public interface ICategoryRepository extends JpaRepository<Category, Long> {

}
