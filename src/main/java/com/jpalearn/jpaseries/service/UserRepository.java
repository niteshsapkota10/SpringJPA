package com.jpalearn.jpaseries.service;

import com.jpalearn.jpaseries.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
