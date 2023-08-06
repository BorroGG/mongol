package gg.borro.mongo.learn.mongol.service;

import gg.borro.mongo.learn.mongol.model.Book;

import java.util.List;

public interface BookService {

    Book createBook(Book book);
    Book updateBook(Book book);
    void deleteBookById(String id);
    List<Book> findBookByRatingGreaterThan(Integer rating);
    List<Book> findBookByRatingLessThan(Integer rating);
}
