package com.springbase.service.mapper;

import com.springbase.domain.User;
import com.springbase.service.dto.UserDTO;
import com.springbase.service.dto.UserListDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface UserMapper {

    List<UserListDTO> toListDto(List<User> entity);
}
