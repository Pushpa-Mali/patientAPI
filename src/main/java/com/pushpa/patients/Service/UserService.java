package com.pushpa.patients.Service;

import com.pushpa.patients.Entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store=new ArrayList<>();

    public UserService() {

        store.add(new User(UUID.randomUUID().toString(),"Pushpa Mali","pushpa@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
