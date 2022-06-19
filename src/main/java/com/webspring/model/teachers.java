package com.webspring.model;

import javax.persistence.*;

@Entity
public class teachers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int teacherId;
    private String teachername;
    private String email;
    private String password;
    private String contact;
    private String department;
    private String gender;

    @ManyToOne
    private Admin admin;

    
public teachers(int teacherId, String teachername, String email, String password, String contact, String department,
            String gender, Admin admin) {
        this.teacherId = teacherId;
        this.teachername = teachername;
        this.email = email;
        this.password = password;
        this.contact = contact;
        this.department = department;
        this.gender = gender;
        this.admin = admin;
    }
public teachers(){
    
}
public int getTeacherId() {
    return teacherId;
}
public void setTeacherId(int teacherId) {
    this.teacherId = teacherId;
}
public String getTeachername() {
    return teachername;
}
public void setTeachername(String teachername) {
    this.teachername = teachername;
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
    return "teachers [admin=" + admin + ", contact=" + contact + ", department=" + department + ", email=" + email
            + ", gender=" + gender + ", password=" + password + ", teacherId=" + teacherId + ", teachername="
            + teachername + "]";
}

}
