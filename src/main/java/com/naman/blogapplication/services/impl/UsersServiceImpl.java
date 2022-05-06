package com.naman.blogapplication.services.impl;

import com.naman.blogapplication.dto.UsersDto;
import com.naman.blogapplication.entity.Users;
import com.naman.blogapplication.repository.UsersRepo;
import com.naman.blogapplication.services.UsersService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.apache.commons.lang3.exception.*;

import java.util.List;
import java.util.Objects;

@Service
@NoArgsConstructor
@Data
public class UsersServiceImpl implements UsersService {

    private UsersRepo usersRepo;

    @Autowired
    public UsersServiceImpl(final UsersRepo usersRepo){
        this.usersRepo=usersRepo;
    }

    @Override
    public Users createUser(Users user) {
        System.out.println(user.toString());
        if(!Objects.isNull(usersRepo)){
            System.out.println(usersRepo.hashCode());
        }
        else {
            System.out.println("Object null");
        }
        try{
            return usersRepo.save(user);
        }
        catch (Throwable e){
            e.printStackTrace();
        }
        return null;
    }

//    @Override
//    public UsersDto updateUser(Users user, Integer id) {
//        return null;
//    }
//
//    @Override
//    public void deleteUserById(Integer id) {
//
//    }
//
//    @Override
//    public void deleteAllUser() {
//
//    }
//
//    @Override
//    public UsersDto getUserById(Integer id) {
//        return null;
//    }
//
//    @Override
//    public List<UsersDto> getAllUser() {
//        return null;
//    }
}
