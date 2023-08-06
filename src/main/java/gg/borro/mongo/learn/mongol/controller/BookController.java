package gg.borro.mongo.learn.mongol.controller;

import gg.borro.mongo.learn.mongol.model.Book;
import gg.borro.mongo.learn.mongol.security.config.WorkAccess;
import gg.borro.mongo.learn.mongol.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Контроллер для работы с книгами")
@RequestMapping(value = "/book")
@RestController
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @Operation(summary = "Добавить новую книгу")
    @PostMapping(value = "/")
    @PreAuthorize("hasAuthority('developers:write')")
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @Operation(summary = "Обновить данные о книге")
    @PatchMapping(value = "/")
    @PreAuthorize("hasAuthority('developers:write')")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @Operation(summary = "Удалить книгу")
    @DeleteMapping (value = "/")
    @PreAuthorize("hasAuthority('developers:write')")
    public void deleteBookById(@RequestBody String id) {
        bookService.deleteBookById(id);
    }

    @Operation(summary = "Найти книги с рейтингом выше предоставленного значения")
    @GetMapping(value = "/find/gtRating")
    @PreAuthorize("hasAuthority('developers:read')")
    @WorkAccess
    public List<Book> findBookByRatingGreaterThan(
            @Parameter(description = "Рейтинг", required = true)
            @RequestParam Integer rating) {
        return bookService.findBookByRatingGreaterThan(rating);
    }

    @Operation(summary = "Найти книги с рейтингом ниже предоставленного значения")
    @GetMapping(value = "/find/ltRating")
    @PreAuthorize("hasAuthority('developers:read')")
    public List<Book> findBookByRatingLessThan(
            @Parameter(description = "Рейтинг", required = true)
            @RequestParam Integer rating) {
        return bookService.findBookByRatingLessThan(rating);
    }
}
