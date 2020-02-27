package com.cjw.controller;

import com.cjw.pojo.Book;
import com.cjw.pojo.ReturnData;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @auther 程佳伟
 * @create 2020-02-27 15:04
 */
@RestController
@RequestMapping("/bt")
public class BootstrapTableController {

    @GetMapping("/getBooks")
    public List<Book> getBooks(){

        List<Book> books = new ArrayList<>();

        Book book = null;
        for(int i = 1 ; i < 10 ; i++){

            book = new Book("kj2020_" + i,"我的世界" + i,"cjw" + i,"科技",9.8 + i,new Date());
            books.add(book);
        }

        return books;
    }

    @GetMapping("/getBookList")
    public ReturnData<Book> getBooks(Book params){

        int offset = params.getOffset();
        int pageSize = params.getPageSize();
        int pageNum = (int)Math.ceil((double) offset / (double)pageSize);

        int total = 100;

        ReturnData<Book> bookList = new ReturnData<>(pageNum,pageSize,total);

        if(offset < 1 || offset > total || pageNum < 1 || pageSize < 1){
            return bookList;
        }

        List<Book> books = new ArrayList<>();

        Book book = null;
        for(int i = offset; i <= ((offset + pageSize) > total ? total : (offset + pageSize)) ; i++){

            book = new Book("kj2020_" + i,"我的世界" + i,"cjw" + i,"科技",9.8 + i,new Date());
            books.add(book);
        }

        bookList.setRows(books);

        return bookList;
    }
}
