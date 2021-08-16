package com.example.maptructdemo.service.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users {
    List<User> users;
    UserType type;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class UserType{
        private int type;
    }
}
