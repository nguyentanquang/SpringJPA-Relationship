package vn.iviettech.spring.jpa.realationship.repository;

import org.springframework.data.repository.CrudRepository;
import vn.iviettech.spring.jpa.realationship.entity.Book;

import java.util.List;

/**
 * Created by Admin on 08/06/2017.
 */
public interface BookRepository extends CrudRepository<Book, Integer>{
    public List<Book> findByAuthor(String author);
    public List<Book> findByNameAndAuthor(String name, String author);
    public List<Book> findByNameOrAuthor(String name, String author);

}
