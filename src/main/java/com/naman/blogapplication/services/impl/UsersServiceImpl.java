package com.naman.blogapplication.services.impl;

import com.naman.blogapplication.dto.UserDto;
import com.naman.blogapplication.entity.User;
import com.naman.blogapplication.repository.UsersRepo;
import com.naman.blogapplication.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    private final UsersRepo usersRepo;

    @Autowired
    public UsersServiceImpl(final UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = userDtoToUser(userDto);
        User savedUser = this.usersRepo.save(user);
        return userToUserDto(savedUser);
    }

    @Override
    public UserDto updateUser(User user, Integer id) {
        return null;
    }

    @Override
    public void deleteUserById(Integer id) {

    }

    @Override
    public void deleteAllUser() {

    }

    @Override
    public UserDto getUserById(Integer id) {
        return null;
    }

    @Override
    public List<UserDto> getAllUser() {
        return null;
    }

    private User userDtoToUser(UserDto userDto){
        User user = new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPass(userDto.getPass());
        user.setAbout(userDto.getAbout());
        return  user;
    }

    private UserDto userToUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setPass(user.getPass());
        userDto.setAbout(user.getAbout());
        return userDto;
    }
}
