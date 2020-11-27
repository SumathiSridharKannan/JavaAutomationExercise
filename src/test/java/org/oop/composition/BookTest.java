package org.oop.composition;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    @Test
    void getAuthorsFromBook() {
        var bookName = "Hamlet";
        var authorName1 = "W";
        var authorName2 = "S";
        var author1 = new Author(authorName1, "w@gmail.com", 'M');
        var author2 = new Author(authorName2, "s@gmail.com", 'F');
        var authors = new Author[]{author1, author2};
        var price = 123.00;
        var qty = 2;
        Book book = new Book(bookName, authors, price, qty);

        var authorNames = book.getAuthorNames();
        assertEquals(authorName1 + authorName2, authorNames);

    }


}