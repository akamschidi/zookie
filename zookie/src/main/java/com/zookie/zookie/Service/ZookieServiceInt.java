package com.zookie.zookie.Service;

import java.util.List;

import com.zookie.zookie.Entity.ZookieEntity;

public interface ZookieServiceInt {

    public ZookieEntity createZookie(ZookieEntity zookieEntity);
    public List<ZookieEntity> ZookieListAll();
    public ZookieEntity zookieGetID(Integer bookID);
    //public ZookieEntity zookieGetAuthor(String author);
 //  public ZookieEntity updateZookie(Integer bookID, ZookieEntity zookieEntity);
 public void deleteZookie(Integer bookID);
    
}
