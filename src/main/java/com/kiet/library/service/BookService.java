package com.kiet.library.service;
import org.springframework.stereotype.Service;

import com.kiet.library.model.Book;

import java.util.*;
@Service
public class BookService {
    private List<Book> books = new ArrayList<>();
    public BookService(){
        books.add(new Book(201, "Effective Java",
                "Joshua Bloch", "Programming", 2018, true));

        books.add(new Book(202, "Clean Code",
                "Robert C. Martin", "Programming", 2008, true));

        books.add(new Book(203, "The Alchemist",
                "Paulo Coelho", "Fiction", 2015, false));

        books.add(new Book(204, "Introduction to Algorithms",
                "Thomas H. Cormen", "Computer Science", 2022, true));

        books.add(new Book(205, "Java Complete Reference",
                "Herbert Schildt", "Programming", 2021, true));
    }
    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public Book getBookById(int bookId) {

        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }

        return null;
    }

    public Book addBook(Book book) {
        books.add(book);
        return book;
    }

    public Book updateBook(int bookId, Book updatedBook) {

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getBookId() == bookId) {

                updatedBook.setBookId(bookId);
                books.set(i, updatedBook);

                return updatedBook;
            }
        }

        return null;
    }

    public boolean deleteBook(int bookId) {

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getBookId() == bookId) {
                books.remove(i);
                return true;
            }
        }

        return false;
    }

    public List<Book> searchByCategory(String category) {

        List<Book> result = new ArrayList<>();

        for (Book book : books) {

            if (book.getCategory() != null
                    && book.getCategory().equalsIgnoreCase(category)) {
                result.add(book);
            }
        }

        return result;
    }

    public List<Book> findPublishedFromYear(int fromYear) {

        List<Book> result = new ArrayList<>();

        for (Book book : books) {

            if (book.getPublicationYear() >= fromYear) {
                result.add(book);
            }
        }

        return result;
    }
}



