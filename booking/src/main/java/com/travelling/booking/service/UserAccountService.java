package com.travelling.booking.service;


import com.travelling.booking.NoSuchUserException;
import com.travelling.booking.entity.User;

import java.util.List;
import java.util.Optional;


public interface UserAccountService {

    List<User> getListOfUser();

    Optional<User> getUserById(Long id);

    Optional<User> saveUser(User user);

    void deleteUser(User user);

    Optional<User> updateUserById(Long id, User user) throws NoSuchUserException;


}
