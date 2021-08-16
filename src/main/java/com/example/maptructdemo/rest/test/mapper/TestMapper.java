package com.example.maptructdemo.rest.test.mapper;


import com.example.maptructdemo.rest.test.dto.UserDto;
import com.example.maptructdemo.rest.test.dto.UsersDto;
import com.example.maptructdemo.service.test.User;
import com.example.maptructdemo.service.test.Users;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TestMapper {

    TestMapper INSTANCE = Mappers.getMapper(TestMapper.class);

    User userDtoToUser(UserDto userDto);

    List<User> usersDtoToUsers(List<UserDto> usersDto);


    Users usersDtoToUsers(UsersDto usersDto);

    Users.UserType usersDtoToUsers(UsersDto.UserTypeDto userTypeDto);
}
