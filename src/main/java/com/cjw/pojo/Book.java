package com.cjw.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Description
 * @auther 程佳伟
 * @create 2020-02-27 15:05
 */
@Getter
@Setter
@ToString
public class Book extends Page {

    private Long id;
    private String bookNo;
    private String bookName;
    private String author;
    private String category;
    private Double price;
    private Date publishTime;

    public Book(String bookNo, String bookName, String author, String category, Double price, Date publishTime) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.author = author;
        this.category = category;
        this.price = price;
        this.publishTime = publishTime;
    }
}
