package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "HangPhong")
public class HangPhong implements Serializable {
    @Id
    private String MaHP;
    private Long Gia;
    @OneToMany(mappedBy = "hangphong",cascade = CascadeType.ALL)
    private Set<Phong> phongs;
    @ManyToOne
    @JoinColumn(name = "MaKP")
    private KieuPhong kieuphong;
    @ManyToOne
    @JoinColumn(name = "MaLP")
    private LoaiPhong loaiphong;
    @OneToMany(mappedBy = "hangphong",cascade = CascadeType.ALL)
    private Set<ChiTietPhieuDat> chitietphieudats;

}
