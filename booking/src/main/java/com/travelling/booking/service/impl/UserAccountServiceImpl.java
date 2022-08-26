package com.travelling.booking.service.impl;

import com.travelling.booking.NoSuchUserException;
import com.travelling.booking.entity.User;
import com.travelling.booking.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.travelling.booking.repository.UserAccountRepository;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Override
    public List<User> getListOfUser() {
        return userAccountRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userAccountRepository.findById(id);
    }

    @Override
    public Optional<User> saveUser(User user) {
        return Optional.of(userAccountRepository.save(user));
    }

    @Override
    public void deleteUser(User user) {
        userAccountRepository.delete(user);
    }

    @Override
    public Optional<User> updateUserById(Long id, User user) throws NoSuchUserException {
        User oldUser = userAccountRepository.findById(id).orElseThrow(()->new NoSuchUserException("Such user with the id does not exist"));
        oldUser.setFirstName(user.getFirstName());
        oldUser.setLastName(user.getLastName());
        oldUser.setPassword(user.getPassword());
        oldUser.setUsername(user.getUsername());

        return Optional.of(oldUser);
    }
}
