package com.aptech.demorestfull.controller;


import com.aptech.demorestfull.dto.LoginReponse;
import com.aptech.demorestfull.dto.LoginRequest;
import com.aptech.demorestfull.service.AcccountService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/account")
public class AccountController {

    @Inject
    AcccountService acccountService;

    @Path("/login")
    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public LoginReponse login(LoginRequest loginRequest){

        return acccountService.login(loginRequest);
    }
}
