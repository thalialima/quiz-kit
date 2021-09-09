package com.keyrus.kit.quiz.service;

import com.keyrus.kit.quiz.dto.UserDTO;
import com.keyrus.kit.quiz.form.UserForm;

import java.util.List;

public interface UserService {

    List<UserDTO> getAllUsers();

    UserDTO getUserById(Long id);

    void createUser(UserForm userForm);

    void updateUser(Long id, UserForm updateUserForm);

    void deleteUser(Long id);

}
