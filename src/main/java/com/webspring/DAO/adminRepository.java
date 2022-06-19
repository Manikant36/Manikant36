package com.webspring.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webspring.model.Admin;

public interface adminRepository extends JpaRepository<Admin,Integer>{
    
}
