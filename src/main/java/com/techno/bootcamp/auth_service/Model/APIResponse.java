package com.techno.bootcamp.auth_service.Model;

import com.techno.bootcamp.auth_service.Util.Constant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class APIResponse<T> {
    private String status;
    private List<String> messages = new ArrayList<>();
    private T data;

    public APIResponse(T data) {
        this.status = Constant.STATUS_SUCCESS;
        this.data = data;
    }
}
