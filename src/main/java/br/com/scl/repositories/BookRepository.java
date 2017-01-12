package br.com.scl.repositories;

import br.com.scl.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends QueryDslCustomerRepository<Book, Long> {
    List<Book> findByTitleIgnoreCaseContaining(String title);
}
