package com.techno.bootcamp.auth_service.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResUserDto {
    private String firstName;
    private String lastName;
    private String email;
    private String role;
}
