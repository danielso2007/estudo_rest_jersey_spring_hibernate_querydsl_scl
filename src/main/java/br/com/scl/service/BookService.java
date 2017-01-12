package br.com.scl.service;

import br.com.scl.domain.Book;
import br.com.scl.lang.ServiceException;

import java.util.List;

public interface BookService {
    List<Book> getBooks() throws ServiceException;

    Book getBook(Long id) throws ServiceException;

    List<Book> getBookByTitle(String title) throws ServiceException;

    void delete(Long id) throws ServiceException;

    Book save(Book book) throws ServiceException;
}
