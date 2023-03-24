package com.aptech.demorestfull.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransferRequest {

    private  String accountSource;
    private  String accountTarget;
    private  Double amount;
    private  String comment;
}
