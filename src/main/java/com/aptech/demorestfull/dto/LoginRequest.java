package com.aptech.demorestfull.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {
    private String accountNo;
    private String pinCode;

}
