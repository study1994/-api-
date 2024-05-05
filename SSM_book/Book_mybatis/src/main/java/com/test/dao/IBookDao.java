package com.test.dao;
import com.test.bean.Book;
import java.util.List;
import java.util.Map;

public interface IBookDao{
    public int insertBook(Book book) throws Exception;
    public int deleteBookByBid(Integer bid) throws Exception;
    public int updateBookByBid(Book book) throws Exception;
    public Book queryBookByBid(Integer bid) throws Exception;
    public List<Book>queryAllBook() throws Exception;
    public Integer queryBookCount() throws Exception;
}

