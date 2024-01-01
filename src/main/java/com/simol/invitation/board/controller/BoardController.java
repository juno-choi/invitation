package com.simol.invitation.board.controller;

import com.simol.invitation.board.domain.ApiData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/board")
public class BoardController {
    @GetMapping("")
    public ApiData get() {
        return ApiData.builder().name("test").build();
    }

}