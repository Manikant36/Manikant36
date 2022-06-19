package com.webspring.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webspring.model.students;

public interface studentRepository extends JpaRepository<students, Integer>
{
    
}
