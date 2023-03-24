package com.aptech.demorestfull.service;

import com.aptech.demorestfull.dto.LoginReponse;
import com.aptech.demorestfull.dto.LoginRequest;
import com.aptech.demorestfull.dto.TransferRequest;
import com.aptech.demorestfull.dto.TransferResponse;

public interface AcccountService {

    LoginReponse login(LoginRequest loginRequest );

    TransferResponse transfer(TransferRequest transferRequest);

}
