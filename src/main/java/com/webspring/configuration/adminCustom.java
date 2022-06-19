package com.webspring.configuration;

import java.util.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.webspring.model.Admin;

public class adminCustom implements UserDetails
{
    private Admin admin;

    
    
    public adminCustom() {
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        
        SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(admin.getEmail());
        
        return List.of(simpleGrantedAuthority);
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return admin.getPassword();
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return admin.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
       
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
      
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
 
        return true;
    }

    @Override
    public boolean isEnabled() {
      
        return true;
    }

}
    

