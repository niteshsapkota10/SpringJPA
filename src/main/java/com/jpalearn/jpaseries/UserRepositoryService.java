package com.jpalearn.jpaseries;

import com.jpalearn.jpaseries.entity.User;
import com.jpalearn.jpaseries.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryService implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        User user=new User("Ritesh","participant");
        userRepository.save(user);
        System.out.println("User Created from Repository "+user);

        Optional<User> user1=userRepository.findById(1L);

        List<User>users=userRepository.findAll();

    }
}
