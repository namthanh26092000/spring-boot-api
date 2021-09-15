package com.example.springbootapi2.repository;

import com.example.springbootapi2.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Students, Long>{
}
