package com.seminar.week2.api.user;

import com.seminar.week2.api.user.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public String register(@RequestBody final RegisterRequestDto request) {
        System.out.println("나이 : " + request.getAge());
        System.out.println("이름 " + request.getName());
        System.out.println("번호 " + request.getContact());
        return "SAVE OK";
    }

    @PostMapping("/v2/user")
    public RegisterResponseDto registerV2(@RequestBody final RegisterRequestDto requestDto) {
        RegisterResponseDto dto = userService.register(requestDto);
        return dto;
    }

    @GetMapping("/user/{userId}")
    public GetResponseDto get(@PathVariable Long userId) {
        return userService.get(userId);
    }

    @PutMapping("/user/{userId}")
    public UpdateResponseDto update(@PathVariable Long userId,
                                    @RequestBody final UpdateRequestDto updateRequestDto) {
        return userService.update(userId, updateRequestDto);
    }

    @DeleteMapping("/user/{userId}")
    public String delete(@PathVariable Long userId) {
        return userService.delete(userId);
    }
}
