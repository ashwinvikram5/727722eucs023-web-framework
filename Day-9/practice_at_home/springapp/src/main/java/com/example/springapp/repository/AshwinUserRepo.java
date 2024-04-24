package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springapp.model.AshwinUser;
import java.util.List;


@Repository
public interface AshwinUserRepo extends JpaRepository<AshwinUser, Integer> {
    @Query(value = "SELECT u FROM User u WHERE u.userId = ?1")
    AshwinUser findByUserId(int userId);

    @Query(value = "SELECT u FROM User u WHERE u.userName=?1")
    AshwinUser findByUserName(String userName);
}
