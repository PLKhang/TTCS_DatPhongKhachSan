package com.example.demo.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HangPhongDTO {
    private String MaHP;
    private String TenHP;
    @NotNull
    private Long DonGia;
    @NotNull
    private String MaKP;
    @NotNull
    private String MaLP;
    private int SoNguoi;
}
