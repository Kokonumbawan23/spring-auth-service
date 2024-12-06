package com.techno.bootcamp.auth_service.Service;

import com.techno.bootcamp.auth_service.Dto.ReqRegistrationDto;
import com.techno.bootcamp.auth_service.Dto.ResUserDto;
import com.techno.bootcamp.auth_service.Model.APIResponse;

import java.util.List;

public interface AuthService {

    APIResponse<List<ResUserDto>> getAllUser();

    APIResponse<String> registration(ReqRegistrationDto req);
}
