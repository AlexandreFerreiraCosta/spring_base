package com.springbase.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import com.springbase.repository.UserRepository;
import com.springbase.service.UserService;
import com.springbase.service.dto.UserListDTO;
import com.springbase.service.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    @Override
    public List<UserListDTO> findAllUsers() {
        return userMapper.toListDto(userRepository.findAll());
    }
}
