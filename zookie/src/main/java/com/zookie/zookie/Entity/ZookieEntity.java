package com.zookie.zookie.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "zookie_bookie")
public class ZookieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookID;
    private String title;
    private String genre;
    private String author;
    @Column(name = "publish_date")
    private String publishDate;

    
    public ZookieEntity() {
    }


    public ZookieEntity(Integer bookID, String title, String genre, String author, String publishDate) {
        this.bookID = bookID;
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.publishDate = publishDate;
    }


    public Integer getBookID() {
        return bookID;
    }


    public void setBookID(Integer bookID) {
        this.bookID = bookID;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getGenre() {
        return genre;
    }


    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public String getPublishDate() {
        return publishDate;
    }


    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }


    @Override
    public String toString() {
        return "ZookieEntity [bookID=" + bookID + ", title=" + title + ", genre=" + genre + ", author=" + author
                + ", publishDate=" + publishDate + "]";
    }

    
    
}
