package com.techno.bootcamp.auth_service.Service.Impl;

import com.techno.bootcamp.auth_service.Dto.ReqRegistrationDto;
import com.techno.bootcamp.auth_service.Dto.ResUserDto;
import com.techno.bootcamp.auth_service.Entity.UserEntity;
import com.techno.bootcamp.auth_service.Model.APIResponse;
import com.techno.bootcamp.auth_service.Repository.UserRepository;
import com.techno.bootcamp.auth_service.Service.AuthService;
import com.techno.bootcamp.auth_service.Util.Constant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    @Override
    public APIResponse<List<ResUserDto>> getAllUser() {
        List<UserEntity> users = userRepository.findAll();

        List<ResUserDto> responseDto = new ArrayList<>();
        for(UserEntity user : users) {
            ResUserDto dto = ResUserDto.builder()
                    .firstName(user.getFirstName())
                    .lastName(user.getLastName())
                    .email(user.getEmail())
                    .role(user.getRole())
                    .build();
//            dto.setFirstName(user.getFirstName());
//            dto.setLastName(user.getLastName());
//            dto.setEmail(user.getEmail());
//            dto.setRole(user.getRole());
//            responseDto.add(dto);
        }

        return new APIResponse<>(responseDto);
    }

    @Override
    public APIResponse<String> registration(ReqRegistrationDto req) {
        UserEntity user = new UserEntity();
        user.setFirstName(req.getFirstName());
        user.setLastName(req.getLastName());
        user.setEmail(req.getEmail());
        user.setPassword(req.getPassword());

        if(req.getRole() == null) {
            user.setRole(Constant.ROLE_USER);
        } else {
            user.setRole(req.getRole());
        }

        userRepository.save(user);

        return new APIResponse<>("User has been registered");
    }
}
