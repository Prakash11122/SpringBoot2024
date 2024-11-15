package com.it.pradhan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.pradhan.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
	/***
	 * Output findBy<Variable><condition>(DataType param); VariableName can be
	 * follows same case or camelCase.
	 */

	// SQL: SELECT * FROM BOOK WHERE AUTHOR=?
//	List<Book> findByauthor(String author);
//	List<Book> findByauthorIs(String author);
//	List<Book> findByAuthorEquals(String author);

	// SQL: SELECT * FROM BOOK WHERE BOOKTYPE=?
	// invalid: findBybtype, findbybooktype, findbookbytype
	// valid : findBybookType, findByBookType
	// List<Book> findByBookType(String bookType);

}
