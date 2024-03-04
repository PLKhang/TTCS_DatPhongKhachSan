package com.example.demo.controller;

import com.example.demo.entity.KieuPhong;
import com.example.demo.DTO.KieuPhongDTO;
import com.example.demo.service.IKieuPhongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Controller
public class PhieuDatController {
    @Autowired
    IKieuPhongService kieuPhongService;

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
    @RequestMapping(value = { "/" ,"home"})
    public String home(Model model) {
        return "index";
    }
    @RequestMapping("/admin")
    public String admin(Model model){
        return "contact";
    }
    @RequestMapping("/login")
    public String login(Model model){
        return "sign_in";
    }
    @RequestMapping("/signup")
    public  String signup(Model model){
        return "sign_up";
    }
}
