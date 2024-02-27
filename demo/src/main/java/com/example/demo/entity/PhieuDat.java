package com.example.demo.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "PhieuDat")
public class PhieuDat implements Serializable {
    @Id
    private String MaPD;
    @OneToMany(mappedBy = "phieudat",cascade = CascadeType.ALL)
    private Set<ChiTietPhieuDat> chitietphieudats;
}
