package com.example.demo.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietPhieuDatModel {
    private String IdPD;
    private String MaPD;
    private String MaHP;
    private int SoLuong;
}
