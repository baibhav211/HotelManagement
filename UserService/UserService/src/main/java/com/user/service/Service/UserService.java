package com.user.service.Service;

import com.user.service.Entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUser(String userId);

    User updateUser(String id, User user);

    void deleteUser(String id);
}
