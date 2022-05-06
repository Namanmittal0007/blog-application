package com.naman.blogapplication.services;

import com.naman.blogapplication.dto.UserDto;
import com.naman.blogapplication.entity.User;

import java.util.List;

public interface UsersService {
    UserDto createUser(UserDto userDto);
    UserDto updateUser(User user, Integer id);
    void deleteUserById(Integer id);
    void deleteAllUser();
    UserDto getUserById(Integer id);
    List<UserDto> getAllUser();

}
