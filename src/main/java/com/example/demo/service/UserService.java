package com.example.demo.service;

import com.example.demo.domain.TodoItem;
import com.example.demo.dto.UserInfoDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class UserService {
    /**
     * User 조회
     *
     * @return
     */
    @Transactional(readOnly = true)
    public UserInfoDto getUser() throws Exception{
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setUserId("82107479");

        return userInfoDto;
    }
}
