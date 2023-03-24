package com.aptech.demorestfull.service;

import com.aptech.demorestfull.dto.LoginReponse;
import com.aptech.demorestfull.dto.LoginRequest;
import com.aptech.demorestfull.dto.TransferRequest;
import com.aptech.demorestfull.dto.TransferResponse;
import com.aptech.demorestfull.model.Account;
import com.aptech.demorestfull.model.SaveTransaction;
import com.aptech.demorestfull.repository.Repository;
import com.aptech.demorestfull.repository.RepositoryImpl;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AccountServiceImpl implements  AcccountService {

    private Repository<Account, String> accountRepository;
    private Repository<SaveTransaction, Integer> transactionRepository;
   public AccountServiceImpl(){

       accountRepository = new RepositoryImpl<>();
       transactionRepository = new RepositoryImpl<>();

    }
    @Override
    public LoginReponse login(LoginRequest loginRequest) {

       accountRepository.setType(Account.class);
       Account account = accountRepository.getById(loginRequest.getAccountNo());
       LoginReponse loginReponse = new LoginReponse();
       if(account != null && account.getPinCode().equals(loginRequest.getPinCode())){

           loginReponse.setAccountNo(loginRequest.getAccountNo());
           loginReponse.setAccountName(account.getAccountName());
           loginReponse.setErrorCode("999");
           loginReponse.setMessage("Login success.");
       }else {
           loginReponse.setErrorCode("1000");
           loginReponse.setMessage("Login fail !!!");
       }

       return  loginReponse;



    }

    @Override
    public TransferResponse transfer(TransferRequest transferRequest) {
        return null;
    }
}
