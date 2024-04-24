package com.example.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.model.AshwinPerson;
import com.example.springapp.repository.AshwinPersonRepo;

@Service
public class AshwinPersonService {
    public AshwinPersonRepo personRepo;

    public AshwinPersonService(AshwinPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(AshwinPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<AshwinPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
