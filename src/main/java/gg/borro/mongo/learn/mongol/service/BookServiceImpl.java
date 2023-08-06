package gg.borro.mongo.learn.mongol.service;

import gg.borro.mongo.learn.mongol.model.Book;
import gg.borro.mongo.learn.mongol.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    @Transactional
    public Book createBook(Book book) {
        return bookRepository.insert(book);
    }

    @Override
    @Transactional
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    @Transactional
    public void deleteBookById(String id) {
        bookRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Book> findBookByRatingGreaterThan(Integer rating) {
        return bookRepository.findBookByRatingGreaterThan(rating);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Book> findBookByRatingLessThan(Integer rating) {
        return bookRepository.findBookByRatingLessThan(rating);
    }
}
