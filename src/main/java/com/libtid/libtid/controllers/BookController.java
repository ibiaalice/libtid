package com.libtid.libtid.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.libtid.libtid.domain.entities.Book;

@RestController
public class BookController {

    @GetMapping("/book/test")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @ResponseBody
    @RequestMapping("/book/all")
    public List<Book> getAllBooks() {
        // TODO: remove the mock data and replace with a call to the database
        Book book1 = new  Book( 1l, "The Lord of the Rings", "J.R.R. Tolkien");
        Book book2 = new  Book( 2l, "The Hobbit", "J.R.R. Tolkien");
        Book book3 = new  Book( 3l, "The Silmarillion", "J.R.R. Tolkien");
        Book book4 = new  Book( 4l, "The Children of Hurin", "J.R.R. Tolkien");
        Book book5 = new  Book( 5l, "The Fall of Gondolin", "J.R.R. Tolkien");
        Book book6 = new  Book( 6l, "The Two Towers", "J.R.R. Tolkien");

        return List.of(book1, book2, book3, book4, book5, book6);
    }

    

}
