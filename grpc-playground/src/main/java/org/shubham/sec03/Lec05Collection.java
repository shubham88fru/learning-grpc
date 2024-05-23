package org.shubham.sec03;

import org.shubham.models.sec03.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Lec05Collection {
    private static Logger logger = LoggerFactory.getLogger(Lec05Collection.class);

    public static void main(String[] args) {
        var book1 = Collection.Book.newBuilder()
                .setTitle("Harry potter")
                .setAuthor("JK Rowling")
                .setPublicationYear(1997)
                .build();

        var book2 = book1.toBuilder().setTitle("Harry puttar").setPublicationYear(1998).build();
        var book3 = book1.toBuilder().setTitle("Hari puttar").setPublicationYear(1999).build();

        var library = Collection.Library.newBuilder()
                .setName("Fantasy lib")
//                .addBooks(book1)
//                .addBooks(book3)
//                .addBooks(book2)
                .addAllBooks(List.of(book1, book2, book3))
                .build();

        logger.info("{}", library);
    }
}
