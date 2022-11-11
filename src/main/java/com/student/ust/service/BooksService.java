package com.student.ust.service;



import com.student.ust.entity.Books;
import com.student.ust.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class BooksService {



    @Autowired
    BooksRepository bookRepository;
    public Books getBookByID(Integer id) {
        //return booksRepository.findById(id).orElse(null);
        return bookRepository.findById(id).orElse(null);
    }




    public List<Books> getBookAll() {
        return bookRepository.findAll();
    }

    public void removeBookById(Integer id) {
        bookRepository.deleteById(id);
    }


    public void saveBook(Books book) {
        book.setCreateDate(LocalDateTime.now());
        book.setModifyDate(book.getCreateDate());
        bookRepository.save(book);
    }

    public void removeBookid(Integer id) {
        bookRepository.deleteById(id);
    }

    public Books updateBook(Books book) {
        //Books updateBook = booksRepository.findById(book.getBookId()).orElseThrow(()->new NoSuchElementException());
        Books updateBook = bookRepository.findById(book.getBookId()).orElseThrow(()->new NoSuchElementException());
        updateBook.setName(book.getName());
        updateBook.setYear(book.getYear());
        updateBook.setPrice(book.getPrice());

        updateBook.setModifyDate(LocalDateTime.now());
        return updateBook;
    }
}


