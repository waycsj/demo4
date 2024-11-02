package com.example.demo4.service;

import com.example.demo4.domain.User;
import com.example.demo4.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository userRepository;

  public User creatUser(User user) {
    return userRepository.save(user);
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public User getUserById(int id, User user) {
    return userRepository.findById(id).get();
  }

  public User updateUser(int id, User user) {
    User oldUser = userRepository.findById(user.getId()).get();
    oldUser.setName(user.getName());
    oldUser.setEmail(user.getEmail());
    oldUser.setAddress(user.getAddress());
    oldUser.setAge(user.getAge());
    userRepository.save(oldUser);
    return oldUser;
  }

  public void deleteUserById(int id) {
    userRepository.deleteById(id);
  }
}
