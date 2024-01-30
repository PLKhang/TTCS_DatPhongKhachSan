package com.DatPhongKhachSan.entity;
//import jakarta.persistence.Entity;

public class KieuPhong{

    private String maKP;
    private String tenKP;
    private boolean wifi;
    private float dienTich;
    private String viewP;
    private String moTa;
    
    public String getMaKP() {
        return maKP;
    }

    public void setMaKP(String maKP) {
        this.maKP = maKP;
    }

    public String getTenKP() {
        return tenKP;
    }

    public void setTenKP(String tenKP) {
        this.tenKP = tenKP;
    }

    public boolean haveWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
    
    public float dienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public String getViewP() {
        return viewP;
    }

    public void setViewP(String viewP) {
        this.viewP = viewP;
    }
    
    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "[" + this.maKP + "," + this.tenKP + "," + this.wifi + "," 
        		+ this.dienTich + "," + this.viewP + "," + this.moTa + "]";
    }

}