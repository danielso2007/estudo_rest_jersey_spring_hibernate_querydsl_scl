package br.com.scl.repositories;


import br.com.scl.domain.BaseEntity;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface QueryDslCustomerRepository<E extends BaseEntity, ID extends Serializable> extends CrudRepository<E, ID>, QueryDslPredicateExecutor<E> {

}
