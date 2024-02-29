package com.example.demo.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "PhieuDat")
public class PhieuDat implements Serializable {
    @Id
    private String MaPD;
    @Temporal(TemporalType.DATE)
    private Date NgayDat;
    @Temporal(TemporalType.DATE)
    private Date NgayBD;
    private int SoNgay;
    private String TrangThai;
    @OneToMany(mappedBy = "phieudat",cascade = CascadeType.ALL)
    private Set<ChiTietPhieuDat> chitietphieudats;
}
