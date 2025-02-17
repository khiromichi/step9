package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserMapper;

/**
 * ユーザー情報 Service
 */
@Service
public class UserService {
//	private final UserMapper userMapper;
    /**
     * ユーザー情報 Mapper
     */
    @Autowired
    private UserMapper userMapper;
//    public UserService(UserMapper userMapper) {
//        this.userMapper = userMapper;
//    }

    /**
     * ユーザー情報検索
　　　* @param userSearchRequest リクエストデータ
     * @return 検索結果
     */
    public User search(UserSearchRequest userSearchRequest) {
        return userMapper.search(userSearchRequest);
//    }
//    public User searchUser(UserSearchRequest request) {
//        return userMapper.search(request);
    }
}