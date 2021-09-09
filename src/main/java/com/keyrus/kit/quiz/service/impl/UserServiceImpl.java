package com.keyrus.kit.quiz.service.impl;

import com.keyrus.kit.quiz.dto.UserDTO;
import com.keyrus.kit.quiz.form.UserForm;
import com.keyrus.kit.quiz.model.User;
import com.keyrus.kit.quiz.repository.UserRepository;
import com.keyrus.kit.quiz.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = this.userRepository.findAll();
        return UserDTO.toUserDtoList(users);
    }

    @Override
    public UserDTO getUserById(Long id) {
        User user = this.userRepository.getById(id);
        return UserDTO.toUserDto(user);
    }

    @Override
    public void createUser(UserForm userForm) {
        User user = User.builder()
                .name(userForm.getName())
                .email(userForm.getEmail())
                .phone(userForm.getPhone())
                .build();
        this.userRepository.save(user);
    }

    @Override
    public void updateUser(Long id, UserForm updateUserForm) {

        User user = this.userRepository.getById(id);

        user.setName(updateUserForm.getName());
        user.setEmail(updateUserForm.getEmail());
        user.setPhone(updateUserForm.getPhone());

    }

    @Override
    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
    }

}
