package gg.borro.mongo.learn.mongol.model;

import gg.borro.mongo.learn.mongol.model.enumeration.BookLanguage;
import gg.borro.mongo.learn.mongol.model.enumeration.BookStatus;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
public class Book {

    @Id
    private String id;
    private String bookName;
    private String authorName;
    private BookLanguage bookLanguage;
    private BookStatus bookStatus;
    private BookLocation bookLocation;
    private List<String> tags;
    private LocalDate dateOfRead;
    private Integer rating;
    private String review;
    @Indexed(sparse = true)
    private Integer numOfRead;
    private LocalDateTime created;

}
