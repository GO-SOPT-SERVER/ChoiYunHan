package com.gosopt.seminarapi.presentation;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
@RequiredArgsConstructor
public class profileController {

    private final Environment env;

    @GetMapping(value = "/profile", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getProfile(Model model) {

        String profile = Arrays.stream(env.getActiveProfiles())
                .findFirst()
                .orElse("default");
        model.addAttribute("profile", profile);
        return "index";
    }
}
