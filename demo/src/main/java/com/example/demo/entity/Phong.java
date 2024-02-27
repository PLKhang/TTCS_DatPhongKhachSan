package com.example.demo.entity;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "Phong")
public class Phong implements Serializable {
    @Id
    private String Maphong;
    @ManyToOne
    @JoinColumn(name = "MaHP")
    private HangPhong hangphong;

}
