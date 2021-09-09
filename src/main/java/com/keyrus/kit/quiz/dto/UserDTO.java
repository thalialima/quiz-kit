package com.keyrus.kit.quiz.dto;

import com.keyrus.kit.quiz.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Long id;

    private String name;

    private String email;

    private String phone;

    public UserDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.phone = user.getPhone();
    }

    public static List<UserDTO> toUserDtoList(List<User> users){
        return users.stream().map(UserDTO::new).collect(Collectors.toList());
    }

    public static UserDTO toUserDto(User user){
        return new UserDTO(user);
    }

}
