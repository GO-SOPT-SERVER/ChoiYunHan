package com.seminar.week2.api.user;

import com.seminar.week2.api.user.dto.*;
import com.seminar.week2.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    public RegisterResponseDto register(RegisterRequestDto requestDto) {
        User user = User.builder()
                .id(1L)
                .age(requestDto.getAge())
                .contact(requestDto.getContact())
                .gender("man")
                .isStudent(true)
                .name(requestDto.getName())
                .build();

        return new RegisterResponseDto(user.getName(),user.getContact(), user.getAge());
    }

    public GetResponseDto get(Long userId) {
        User user = User.builder()
                .id(1L)
                .age(20)
                .contact("010-1123-1234")
                .gender("man")
                .isStudent(true)
                .name("unan")
                .build();

        if (userId != user.getId()) {
            throw new RuntimeException("유저 존재하지 않습니다.");
        }
        return new GetResponseDto(
                user.getName(), user.getContact(), user.getAge());
    }

    public UpdateResponseDto update(Long userId, UpdateRequestDto requestDto) {
        User user = User.builder()
                .id(1L)
                .age(20)
                .contact("010-1123-1234")
                .gender("man")
                .isStudent(true)
                .name("unan")
                .build();

        user.setAge(requestDto.getAge());
        user.setContact(requestDto.getContact());
        user.setName(requestDto.getName());

        return new UpdateResponseDto(user.getName(), user.getContact(), user.getAge());
    }

    public String delete(Long userId) {
        User user = User.builder()
                .id(1L)
                .age(20)
                .contact("010-1123-1234")
                .gender("man")
                .isStudent(true)
                .name("unan")
                .build();

        user = null;
        return "OK";
    }

}
