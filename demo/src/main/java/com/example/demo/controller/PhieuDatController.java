package com.example.demo.controller;

import com.example.demo.entity.PhieuDat;
import com.example.demo.service.IPhietDatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PhieuDatController {
    @Autowired
    IPhietDatService phietDatService;
    @RequestMapping("phieudat")
    public String listphieudat(ModelMap model){
        List<PhieuDat> list=phietDatService.findAll();
        model.addAttribute("phieudat",list);
        return "phieudat";
    }
}
