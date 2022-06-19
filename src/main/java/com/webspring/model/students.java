package com.webspring.model;

import javax.persistence.*;

@Entity 
public class students {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;
    private String studentname;
    private String email;
    private String password;
    private String contact;
    private String department;
    private String gender;
    
    @ManyToOne
    private Admin admin;

    public students(int studentId, String studentname, String email, String password, String contact, String department,
            String gender, Admin admin) {
        this.studentId = studentId;
        this.studentname = studentname;
        this.email = email;
        this.password = password;
        this.contact = contact;
        this.department = department;
        this.gender = gender;
        this.admin = admin;
    }
    
    public students(){
        
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentname() {
        return studentname;
    }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
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
    public Admin getAdmin() {
        return admin;
    }
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "students [admin=" + admin + ", contact=" + contact + ", department=" + department + ", email=" + email
                + ", gender=" + gender + ", password=" + password + ", studentId=" + studentId + ", studentname="
                + studentname + "]";
    }

    
}
