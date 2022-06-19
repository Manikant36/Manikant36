package com.webspring.configuration;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.webspring.DAO.adminRepository;
import com.webspring.model.Admin;

@Service
public class adminServiceImpl implements UserDetailsService {

    @Autowired
    private adminRepository adminrepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Admin admin =adminrepo.findByEmailAdmin(username);
        
        if(admin==null){

            throw new UsernameNotFoundException(username + " Error 404 user not found");

        }

        return new adminCustom();
    }
    
}
