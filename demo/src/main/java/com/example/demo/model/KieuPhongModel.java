package com.example.demo.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KieuPhongModel {
    private String MaKP;
    private String TenKP;
    private boolean Wifi;
    private float DienTich;
    private String ViewPhong;
    private String Mota;
}
