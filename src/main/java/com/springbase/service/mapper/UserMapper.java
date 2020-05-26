package com.springbase.service.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.springbase.domain.User;
import com.springbase.service.dto.UserListDTO;

@Mapper(componentModel = "spring", uses = {})
public interface UserMapper {

    List<UserListDTO> toListDto(List<User> entity);
}
