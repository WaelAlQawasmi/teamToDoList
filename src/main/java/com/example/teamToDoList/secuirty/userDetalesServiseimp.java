package com.example.teamToDoList.secuirty;

import com.example.teamToDoList.Repositories.UsersRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service // to create service
public class userDetalesServiseimp implements UserDetailsService { // this interface use to know the login page whatch reo use
    @Autowired
    UsersRepositorie UserRebo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {// you must added
        System.out.println(username);
        return UserRebo.findByusername(username);
    }
}
