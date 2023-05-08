package net.javaguides.sms.service;



import net.javaguides.sms.entity.Book;
import net.javaguides.sms.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    public BookRepository bRepo;
    public void save(Book b){
        bRepo.save(b);
    }
    public List<Book> getAllBook(){
        return bRepo.findAll();
    }


    public Book getBookById(int id){
        return bRepo.findById(id).get();
    }
    public void deleteById(int id){
        bRepo.deleteById(id);
    }

}

