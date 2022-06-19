package com.webspring.model;

import java.util.*;


import javax.persistence.*;

@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int AdminId;
    private String adminname;
    private String email;
    private String password;
    private String contact;
    private String department;

    private String gender;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "admin" )
    private List<teachers> teacher =new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "admin" )
    private List<students> student= new ArrayList<>();

  

    public Admin(int adminId, String adminname, String email, String password, String contact, String department,
            String gender, List<teachers> teacher, List<students> student) {
        AdminId = adminId;
        this.adminname = adminname;
        this.email = email;
        this.password = password;
        this.contact = contact;
        this.department = department;
        this.gender = gender;
        this.teacher = teacher;
        this.student = student;
    }

    public Admin() {
    }

    public int getAdminId() {
        return AdminId;
    }

    public void setAdminId(int adminId) {
        AdminId = adminId;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<teachers> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<teachers> teacher) {
        this.teacher = teacher;
    }

    public List<students> getStudent() {
        return student;
    }

    public void setStudent(List<students> student) {
        this.student = student;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Admin [AdminId=" + AdminId + ", adminname=" + adminname + ", contact=" + contact + ", department="
                + department + ", email=" + email + ", gender=" + gender + ", password=" + password + ", student="
                + student + ", teacher=" + teacher + "]";
    }

   

    
    
}
