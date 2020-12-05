package com.netit;

import java.awt.print.Book;

public class BookTable {

    private final DatabaseManager databaseManager;

    public BookTable() {
        databaseManager = DatabaseManager.getInstance();
        databaseManager.createTable("books", "name", "author", "isbn");
    }

    public void addBook(String name, String author, String isbn) {
        databaseManager.insert("books", "name", name, "author", author, "isbn", isbn);
    }
}
