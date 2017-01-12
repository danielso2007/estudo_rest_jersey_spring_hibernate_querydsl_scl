package br.com.scl.service.impl;

import br.com.scl.domain.Book;
import br.com.scl.domain.QBook;
import br.com.scl.lang.ServiceException;
import br.com.scl.repositories.BookRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements br.com.scl.service.BookService {

    private QBook qBook = QBook.book;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getBooks() throws ServiceException {
        try {
            Iterable<Book> books = bookRepository.findAll();
            return Lists.newArrayList(books);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException(e);
        }
    }

    @Override
    public Book getBook(Long id) throws ServiceException {
        try {
            return bookRepository.findOne(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException(e);
        }
    }

    @Override
    public List<Book> getBookByTitle(String title) throws ServiceException {
        try {
            return bookRepository.findByTitleIgnoreCaseContaining(title);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(Long id) throws ServiceException {
        try {
            bookRepository.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException(e);
        }
    }

    @Override
    public Book save(Book book) throws ServiceException {
        try {
            return bookRepository.save(book);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException(e);
        }
    }

}
