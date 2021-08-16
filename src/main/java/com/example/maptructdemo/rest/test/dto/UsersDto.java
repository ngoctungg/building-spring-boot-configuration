package com.example.maptructdemo.rest.test.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsersDto {
    private List<UserDto> users;
    private UserTypeDto type;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class UserTypeDto{
        private int type;
    }
}
