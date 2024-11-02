package com.example.demo4.controller;

import com.example.demo4.domain.User;
import com.example.demo4.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//라이브러리에서 제공하는 어노테이션 +  필수 인자를 갖는 생성자를 자동으로 생성함
@RequiredArgsConstructor
public class UserController {
  private final UserService userService;

  @PostMapping(value = "/user")
  public User createUser(@RequestBody User user) {
    return userService.creatUser(user);
  }

  @GetMapping(value = "/user")
  public List<User> getAllUser() {
    return userService.getAllUsers();
  }

  @GetMapping(value = "/user/{userId}")
  public User getOneUser(@PathVariable("userId") int userId, @RequestBody User user) {
    return userService.getUserById(userId, user);
  }

  @PatchMapping(value = "/user/{userId}")
  public User updateUser(@PathVariable("userId") int userId, @RequestBody User user) {
    return userService.updateUser(userId, user);
  }

  @DeleteMapping(value = "/user/{userId}")
  public void deleteUser(@PathVariable("userId") int userId) {
    userService.deleteUserById(userId);
  }
}