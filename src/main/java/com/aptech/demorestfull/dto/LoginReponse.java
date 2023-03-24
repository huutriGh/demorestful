package com.aptech.demorestfull.dto;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginReponse {

    private String errorCode;
    private String message;
    private String accountName;
    private String accountNo;


}
