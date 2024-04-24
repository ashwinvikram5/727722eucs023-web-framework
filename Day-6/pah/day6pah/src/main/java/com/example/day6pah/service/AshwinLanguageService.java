package com.example.day6pah.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6pah.model.AshwinLanguage;
import com.example.day6pah.repository.LanguageRepo;

@Service
public class AshwinLanguageService {
    public LanguageRepo languageRepo;
    public AshwinLanguageService(LanguageRepo languageRepo)
    {
        this.languageRepo = languageRepo;
    }
    public boolean postLanguage(AshwinLanguage language)
    {
        try{

            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AshwinLanguage> getSortedLanguages(String field)
    {
        return languageRepo.findAll(Sort.by(field));
    }
    public List<AshwinLanguage> getPaginationLanguages(int offset,int size)
    {
        return languageRepo.findAll(PageRequest.of(offset, size)).getContent();
        // return childrenRepo.findAll(Pageable.ofSize(size).withPage(offset)).getContent();
                        
    }
    public List<AshwinLanguage> getSortedPaginationLanguages(int offset,int size,String field)
    {
        return languageRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
}
