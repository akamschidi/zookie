package com.zookie.zookie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zookie.zookie.Entity.ZookieEntity;


public interface ZookieRepo extends JpaRepository <ZookieEntity, Integer>{

    Object deleteById = null;

   // public ZookieEntity getByAuthorIgnoreCase(String author);
   
}
