package com.examly.class_exercise_1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_1.model.AshwinPerson;

/**
 * PersonRepo
 */
@Repository
public interface AshwinPersonRepo extends JpaRepository<AshwinPerson, Integer> {

     List<AshwinPerson> findByAge(int byAge);
}