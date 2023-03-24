package com.aptech.demorestfull.repository;

import com.aptech.demorestfull.model.Account;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class AccountRepository extends RepositoryImpl<Account, String> {

}
