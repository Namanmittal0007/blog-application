package com.naman.blogapplication.repository;

import com.naman.blogapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface UsersRepo extends JpaRepository<User,Integer> {
}
