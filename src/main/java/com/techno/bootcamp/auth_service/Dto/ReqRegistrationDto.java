package com.techno.bootcamp.auth_service.Dto;

import lombok.Data;

@Data
public class ReqRegistrationDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;
}
