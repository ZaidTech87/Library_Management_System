package com.example.Library_Management_System.service.impl;

import com.example.Library_Management_System.dto.ResponceDTO.AuthorResponseDTO;
import com.example.Library_Management_System.entity.Author;
import com.example.Library_Management_System.repository.AuthorRepository;
import com.example.Library_Management_System.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public  class AuthorServiceiImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public String addAuthor(Author author) {
        authorRepository.save(author);
        return "Author added successfully";
    }
    public String deleteAuthor(int id) {
        authorRepository.deleteById((long) id);
        return "Author deleted successfully";

    }
    public String updateAuthor(int id,String name) {
        authorRepository.findById((long) id);
        Author author =  new Author();
        author.setName(name);
        authorRepository.save(author);
        return "Author updated successfully";
    }
    public Author findAuthorById(@RequestParam int id){
        return authorRepository.findById((long) id).get();
    }
    public List<Author> findAllAuthor(){
        return authorRepository.findAll();
    }
public AuthorResponseDTO getById(String email){
        Author author= AuthorRepository.findByEmail(email);

        AuthorResponseDTO authorResponseDTO = new AuthorResponseDTO();
        authorResponseDTO.setName(author.getName());
        authorResponseDTO.setAge(author.getAge());
        return authorResponseDTO;

}


}
