package com.naman.blogapplication.repository;

import com.naman.blogapplication.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface UsersRepo extends JpaRepository<Users,Integer> {
}
