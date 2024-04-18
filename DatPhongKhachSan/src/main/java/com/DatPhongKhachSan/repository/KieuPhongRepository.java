package com.DatPhongKhachSan.repository;

import com.DatPhongKhachSan.entity.KieuPhong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KieuPhongRepository extends JpaRepository<KieuPhong,String> {
    List<KieuPhong> findAll();
}

