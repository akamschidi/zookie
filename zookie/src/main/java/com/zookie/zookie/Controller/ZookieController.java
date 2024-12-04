package com.zookie.zookie.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


import com.zookie.zookie.Entity.ZookieEntity;
import com.zookie.zookie.Service.ZookieService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class ZookieController {

    private final ZookieService zookieService;

@Autowired
    public ZookieController(ZookieService zookieService) {
        this.zookieService = zookieService;
    }
    
    @PostMapping("/createzookie")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ZookieEntity createZookie(@RequestBody ZookieEntity zookieEntity){
        return zookieService.createZookie(zookieEntity);
    }
    
    @GetMapping("/allzookie")
    public List<ZookieEntity> ZookieListAll() {
        return zookieService.ZookieListAll();
    }
    
    @GetMapping("/zookie/{id}")
    public ZookieEntity zookieGetID(@PathVariable ("id") Integer bookID) {
        return zookieService.zookieGetID(bookID);
    }

    @DeleteMapping("/zookiedelete/{id}")
    public ResponseEntity<String> deleteZookie(@PathVariable ("id") Integer bookID){

           try {
            zookieService.deleteZookie(bookID);
           return ResponseEntity.ok("Zookie Deleted Successfully...");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(404).body(e.getMessage()); 
        }
    }
}
      
    
/* 
    @PutMapping("zookieupdate/{id}")
    @ResponseStatus (value = HttpStatus.ACCEPTED)
    public ZookieEntity putMethodName(@PathVariable ("id") String bookID, ZookieEntity zookieEntity) {
        ZookieEntity zoooky = zookieService.updateZookie(3, zookieEntity);
       return zoooky;
    }

    

    @GetMapping("/zookie/{name}")
    public ZookieEntity zookieGetAuthor(@PathVariable ("name") String author) {
        return zookieService.zookieGetAuthor(author);
    }
 */   


