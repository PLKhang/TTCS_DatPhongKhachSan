package com.example.demo.repository;

import com.example.demo.entity.PhieuDat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhieuDatRepository extends JpaRepository<PhieuDat,String> {

}
