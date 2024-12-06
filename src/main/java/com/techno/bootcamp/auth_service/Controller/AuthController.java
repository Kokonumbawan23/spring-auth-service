package com.techno.bootcamp.auth_service.Controller;

import com.techno.bootcamp.auth_service.Dto.ReqRegistrationDto;
import com.techno.bootcamp.auth_service.Dto.ResUserDto;
import com.techno.bootcamp.auth_service.Model.APIResponse;
import com.techno.bootcamp.auth_service.Service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/users")

public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping
    public ResponseEntity<APIResponse<List<ResUserDto>>> getAllUser() {
        return ResponseEntity.ok(authService.getAllUser());
    }

    @PostMapping("/registration")
    public ResponseEntity<APIResponse<String>> registration(@RequestBody ReqRegistrationDto req) {
        return new ResponseEntity<>(authService.registration(req), HttpStatus.CREATED);
    }
}
