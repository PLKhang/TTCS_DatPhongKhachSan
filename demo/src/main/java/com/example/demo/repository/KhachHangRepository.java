package com.example.demo.repository;

import com.example.demo.entity.KhachHang;
import com.example.demo.entity.Role;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class KhachHangRepository  {
    @Autowired
    private EntityManager entityManager;
    public void save(KhachHang khachHang){
        entityManager.persist(khachHang);
    }
}
