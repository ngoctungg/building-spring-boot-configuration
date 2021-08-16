package com.example.maptructdemo;

import com.example.maptructdemo.rest.test.dto.UserDto;
import com.example.maptructdemo.rest.test.dto.UsersDto;
import com.example.maptructdemo.rest.test.mapper.TestMapper;
import com.example.maptructdemo.service.test.User;
import com.example.maptructdemo.service.test.Users;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MaptructdemoApplicationTests {

	@Test
	void contextLoads() {


	}

	@Test
	public void testMapper(){
		UserDto userDto = UserDto.builder()
				.username("Tung")
				.password("1211")
				.build();
		User user = TestMapper.INSTANCE.userDtoToUser(userDto);
		assertEquals(userDto.getUsername(), user.getUsername());
	}

	@Test
	public void testComplexDtoMapper(){
		UserDto userDto = UserDto.builder()
				.username("Tung")
				.password("1211")
				.build();
		UsersDto usersDto = UsersDto.builder()
				.users(Arrays.asList(userDto)).build();
		Users users = TestMapper.INSTANCE.usersDtoToUsers(usersDto);
		assertEquals(usersDto.getUsers().size(),users.getUsers().size());
	}

	@Test
	public void testComplexDtoMapper2(){
		UserDto userDto = UserDto.builder()
				.username("Tung")
				.password("1211")
				.build();
		UsersDto usersDto = UsersDto.builder()
				.users(Arrays.asList(userDto))
				.type(UsersDto.UserTypeDto.builder().type(1).build()).build();
		Users users = TestMapper.INSTANCE.usersDtoToUsers(usersDto);
		assertEquals(usersDto.getType().getType(),users.getType().getType());
	}

}
