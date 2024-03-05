package com.example.demo.controller;

import com.example.demo.entity.KieuPhong;
import com.example.demo.DTO.KieuPhongDTO;
import com.example.demo.service.IKieuPhongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Controller
public class PhieuDatController {
    @Autowired
    IKieuPhongService kieuPhongService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @ModelAttribute("isLoggedIn")
    public boolean isLoggedIn() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(authentication.isAuthenticated());
        return authentication != null  && !(authentication instanceof AnonymousAuthenticationToken) && authentication.isAuthenticated();
    }
    @RequestMapping("rooms")
    public String rooms(Model model){
        List<KieuPhong> kieuphongs=kieuPhongService.findAll();
        List<KieuPhongDTO> kieuphongDTOs = new ArrayList<>();
        for (KieuPhong kieuPhong:kieuphongs){
            KieuPhongDTO kieuPhongDTO=new KieuPhongDTO();
            kieuPhongDTO.loadFromEntity(kieuPhong);
            kieuphongDTOs.add(kieuPhongDTO);
        }
        model.addAttribute("listkieuphong",kieuphongDTOs);
        return "rooms";
    }
    @RequestMapping(value = { "index" ,"home"})
    public String home(Model model) {
        return "index";
    }
    @RequestMapping("admin")
    public String admin(Model model){
        return "admin";
    }
    @RequestMapping("signin")
    public String login(Model model){
        return "sign_in";
    }
    @RequestMapping("signup")
    public  String signup(Model model){
        return "sign_up";
    }
    @RequestMapping("contact")
    public String contact(){
        return "contact";
    }
    @RequestMapping("about")
    public String about(){
        return "about";
    }
}
