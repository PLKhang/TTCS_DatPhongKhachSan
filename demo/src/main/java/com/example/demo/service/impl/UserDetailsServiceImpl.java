package com.example.demo.service.impl;

import com.example.demo.entity.TaiKhoan;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.TaiKhoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;
    @Autowired
    private RoleRepository roleRepository;

    public UserDetails loadUserByUsername(String UserName) throws UsernameNotFoundException{
        TaiKhoan taiKhoan=this.taiKhoanRepository.findUserAccount(UserName);
        if (taiKhoan==null){
            System.out.println("User not found! " + UserName);
            throw new UsernameNotFoundException("User " + UserName + " was not found in the database");
        }
        System.out.println("Found User: " + taiKhoan);
        List<String> roleNames = this.roleRepository.getRoleNames(taiKhoan.getUsername());
        System.out.println(roleNames);
        List<GrantedAuthority> grantedAuthorityList=new ArrayList<GrantedAuthority>();
        if (roleNames!=null){
            for (String role:roleNames){
                GrantedAuthority authority=new SimpleGrantedAuthority(role);
                grantedAuthorityList.add(authority);
            }
        }
        System.out.println(grantedAuthorityList);
        System.out.println(taiKhoan.getEncrytedPassword());
        UserDetails userDetails=(UserDetails) new User(taiKhoan.getUsername(),taiKhoan.getEncrytedPassword(),grantedAuthorityList);
        return userDetails;

    }
}
