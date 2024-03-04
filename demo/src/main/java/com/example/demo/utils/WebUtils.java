package com.example.demo.utils;

import com.example.demo.entity.TaiKhoan;

public class WebUtils {
    public static String toString(TaiKhoan taiKhoan){
        StringBuilder sb=new StringBuilder();
        sb.append("Username:").append(taiKhoan.getUsername());
        return sb.toString();
    }
}
