package gg.borro.mongo.learn.mongol.model.enumeration;

import java.util.Arrays;
import java.util.Optional;

public enum BookLanguage {
    RU("Русский"),
    EN("Английский");

    private final String language;

    BookLanguage(String language) {
        this.language = language;
    }

    public Optional<BookLanguage> fromValue(String language) {
        return Arrays.stream(BookLanguage.values())
                .filter(bookLanguage -> bookLanguage.language.equals(language)).findFirst();
    }
}
