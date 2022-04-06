package com.kachan.registrationserver.domain.mapper;

import com.kachan.registrationserver.domain.dto.UserDto;
import com.kachan.registrationserver.domain.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    User toUser(UserDto userDto);
}
