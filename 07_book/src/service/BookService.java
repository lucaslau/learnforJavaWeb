package service;

import pojo.Book;

import java.util.List;

/**
 * @author 孟享广
 * @date 2020-10-19 4:09 下午
 * @description
 */
public interface BookService {
    public void addBook(Book book);

    public void deleteBookById(Integer id);

    public void updateBook(Book book);

    public Book queryBookById(Integer id);

    public List<Book> queryBooks();

}
