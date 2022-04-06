package com.kachan.registrationserver.service;

import com.kachan.registrationserver.domain.dto.UserDto;
import com.kachan.registrationserver.domain.model.User;

public interface UserService {
    UserDto findById(Long id);

    UserDto addUser(UserDto userDto);

    UserDto updateUser(Long id, UserDto userDto);

    void deleteById(Long id);
}
