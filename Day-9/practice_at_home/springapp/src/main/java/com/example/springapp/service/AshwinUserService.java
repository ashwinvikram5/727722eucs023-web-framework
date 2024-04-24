package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.AshwinUser;
import com.example.springapp.repository.AshwinUserRepo;

@Service
public class AshwinUserService {
   @Autowired
   private AshwinUserRepo userRepo;
   
   public boolean postUser(AshwinUser user)
   {
        try{
            userRepo.save(user);
            return true;
        }
        catch(Exception e){
            return false;
        }   
   }

   public AshwinUser getById(int userId)
   {
        return userRepo.findByUserId(userId);
   }

   public AshwinUser getByUserName(String userName)
   {
        return userRepo.findByUserName(userName);
   }
}
