package com.coderzero.repository;

import com.coderzero.model.Fresher;
import org.springframework.stereotype.Repository;

@Repository
public class FresherRepository {
    public boolean authenticate(Fresher fresher){
        if(fresher.getUsername().equals("hauphvn") && fresher.getPassword().equals("123456")){
            return true;
        }
        return false;
    }

    public boolean registry(Fresher fresher) {
        if(fresher.getPassword().equals(fresher.getUsername())){
            return false;
        }
        return true;
    }
}
