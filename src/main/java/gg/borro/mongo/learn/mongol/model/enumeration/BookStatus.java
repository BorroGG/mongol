package gg.borro.mongo.learn.mongol.model.enumeration;

import java.util.Arrays;
import java.util.Optional;

public enum BookStatus {

    WAITING("Ожидание"),
    ON_COMPUTER("На компьюетере"),
    AT_HOME("Дома"),
    BORROWED("Одолженна");

    private final String status;

    BookStatus(String status) {
        this.status = status;
    }

    public Optional<BookStatus> fromValue(String status) {
        return Arrays.stream(BookStatus.values())
                .filter(bookStatus -> bookStatus.status.equals(status)).findFirst();
    }
}
