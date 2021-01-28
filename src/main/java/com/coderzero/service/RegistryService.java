package com.coderzero.service;

import com.coderzero.model.Fresher;
import com.coderzero.repository.FresherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistryService {
    @Autowired
    private FresherRepository fresherRepository;
    public boolean registry(Fresher fresher){
        if(fresherRepository.registry(fresher)){
            return true;
        }
        return false;
    }
}
