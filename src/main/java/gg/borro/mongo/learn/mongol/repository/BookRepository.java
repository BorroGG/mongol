package gg.borro.mongo.learn.mongol.repository;

import gg.borro.mongo.learn.mongol.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {

    List<Book> findBookByRatingGreaterThan(Integer rating);
    List<Book> findBookByRatingLessThan(Integer rating);

}
