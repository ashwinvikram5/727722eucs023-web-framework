package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.AshwinDoor;
import com.examly.springapp.repository.AshwinDoorRepo;

@Service
public class AshwinDoorService {
    @Autowired
    private AshwinDoorRepo doorRepo;

    public AshwinDoor postData(AshwinDoor door) {
        return doorRepo.save(door);
    }

    public List<AshwinDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public AshwinDoor updateDetail(int doorid, AshwinDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<AshwinDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<AshwinDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public AshwinDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}