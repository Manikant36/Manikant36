package com.webspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.webspring.DAO.adminRepository;
import com.webspring.DAO.studentRepository;
import com.webspring.DAO.teacherRepository;
import com.webspring.model.*;

@Controller
public class mainController {

    @Autowired
    private studentRepository studentrepo;

    @Autowired
    private teacherRepository tRepository;

    @Autowired
    private adminRepository adminrepo;

    @RequestMapping ("/home")
    public String homepage(Model m){

        m.addAttribute("title","Test for view");

        System.out.println("Print");
        return "homepage";
    }

    @RequestMapping ("/userregister")
    public String userregister(Model m){

        m.addAttribute("title","Test for view");

        System.out.println("Print");
        return "userRegister";
    }
    @RequestMapping("/adminregister")
    public String adminregister(@ModelAttribute("admin") Admin admin, Model m)
    {
        Admin admin1 = this.adminrepo.save(admin);

        m.addAttribute("admin", admin1);

        System.out.println(admin1);

        return "adminregister";
    }
    @RequestMapping("/teacherregister")
    public String teacherregister(@ModelAttribute("teacher") teachers teacher, Model m)
    {
        teachers teach = this.tRepository.save(teacher);

        m.addAttribute("teacher", teach);

        System.out.println(teach);

        return "teacherregister";
    }
    
    @RequestMapping("/studentregister")
    public String studentregister(@ModelAttribute("student") students student, Model m){

        students s = this.studentrepo.save(student);

        m.addAttribute("students", s);

        System.out.println(s);

        return "studentregister";
    }

}
