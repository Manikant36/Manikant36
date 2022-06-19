package com.webspring.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webspring.model.teachers;

public interface teacherRepository extends JpaRepository<teachers,Integer>
{
    
}
