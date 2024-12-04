package com.zookie.zookie.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.zookie.zookie.Entity.ZookieEntity;
import com.zookie.zookie.Repository.ZookieRepo;

@Service

public class ZookieService implements ZookieServiceInt{

    private final ZookieRepo zookieRepo;
    
    @Autowired
     public ZookieService(ZookieRepo zookieRepo) {
        this.zookieRepo = zookieRepo;
    }


    @Override
    public ZookieEntity createZookie(ZookieEntity zookieEntity) {
      return zookieRepo.save(zookieEntity);
    }


    @Override
    public List<ZookieEntity> ZookieListAll() {
      return zookieRepo.findAll();
    }


    @Override
    public ZookieEntity zookieGetID(Integer bookID) {
        // return zookieRepo.findById(bookID).get();  //second method for creating the below.....
       
        Optional <ZookieEntity> zookie = zookieRepo.findById(bookID);
        return zookie.orElseThrow(() -> new RuntimeException("User not found with id " + bookID));
        
    }


    @Override
    public void deleteZookie(Integer bookID) {
        if(!zookieRepo.existsById(bookID)){
            throw new IllegalArgumentException("User not found with id: " + bookID);
        }
        
        zookieRepo.deleteById(bookID); 
    }
        
    }

    

/* 
    @Override
    public ZookieEntity updateZookie(Integer bookID, ZookieEntity zookieEntity) { 

    }
*/


    

/* 
    @Override
    public ZookieEntity zookieGetAuthor(String author) {
        return zookieRepo.getByAuthorIgnoreCase(author);
    }
*/

    

