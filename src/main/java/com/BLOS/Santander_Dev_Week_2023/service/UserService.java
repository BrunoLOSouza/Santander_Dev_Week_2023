package com.BLOS.Santander_Dev_Week_2023.service;

import com.BLOS.Santander_Dev_Week_2023.model.User;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate);
}
