package com.jpalearn.jpaseries;

import com.jpalearn.jpaseries.entity.User;
import com.jpalearn.jpaseries.service.UserDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {


    @Autowired
    private UserDAOService userDAOService;

    @Override
    public void run(String... args) throws Exception {
        User user=new User("Nitesh","Admin");
        long id=userDAOService.insert(user);
        System.out.println("New User is Created : "+user);
    }
}
