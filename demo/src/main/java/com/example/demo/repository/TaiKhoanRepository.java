package com.example.demo.repository;

import com.example.demo.entity.TaiKhoan;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class TaiKhoanRepository {
    @Autowired
    private EntityManager entityManager;
    public TaiKhoan findUserAccount(String Username){
        try {
            String sql="Select e from " + TaiKhoan.class.getName()+" e " //
            +" Where e.UserName=:UserName";
            Query query=entityManager.createQuery(sql, TaiKhoan.class);
            query.setParameter("Username",Username);
            return (TaiKhoan) query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }
}
