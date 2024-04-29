package com.example.q1.Ashwinrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.q1.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
