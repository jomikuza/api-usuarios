package com.jc.apiusuarios.web;

import com.jc.apiusuarios.mapper.AutoUserMapper;
import com.jc.apiusuarios.service.IUserService;
import com.jc.apiusuarios.web.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private AutoUserMapper autoUserMapper;

    @GetMapping
    public List<UserDto> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("{id}")
    public UserDto getUser(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public UserDto createUSer(@RequestBody UserDto userDto) {
        return userService.saveUser(userDto);
    }

    @PutMapping("{id}")
    public UserDto updateUser(@PathVariable Integer id, @RequestBody UserDto user) {
        UserDto dto = userService.getUserById(id);
        dto.setName(user.getName());
        return userService.updateUser(dto);
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUserById(id);
    }
}
