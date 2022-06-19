package com.webspring.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.webspring.model.Admin;

public interface adminRepository extends JpaRepository<Admin,Long>
{
    @Query("select u from Admin where u.email= :email")
    public Admin findByEmailAdmin(@Param("email") String email);
}
