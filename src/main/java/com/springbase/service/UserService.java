package com.springbase.service;

import com.springbase.service.dto.UserListDTO;

import java.util.List;


public interface UserService {

    List<UserListDTO> findAllUsers();

}
