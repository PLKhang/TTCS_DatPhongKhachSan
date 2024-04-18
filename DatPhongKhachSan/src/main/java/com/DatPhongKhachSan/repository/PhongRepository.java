package com.DatPhongKhachSan.repository;

import com.DatPhongKhachSan.entity.Phong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongRepository extends JpaRepository<Phong,String> {

}
