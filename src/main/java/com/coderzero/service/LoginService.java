package com.coderzero.service;

import com.coderzero.model.Fresher;
import com.coderzero.repository.FresherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private FresherRepository fresherRepository;
    public boolean login(Fresher fresher){
        return fresherRepository.authenticate(fresher);
    }
}
