package com.example.demo.entity;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "ChiTietPhietDat",uniqueConstraints = {@UniqueConstraint(columnNames = {"MAPD","MAHP"})})
public class ChiTietPhieuDat implements Serializable {
    @Id
    private Long IdPD;
    @ManyToOne
    @JoinColumn(name = "MaPD")
    private PhieuDat phieudat;
    @ManyToOne
    @JoinColumn(name = "MaHP")
    private HangPhong hangphong;


}
