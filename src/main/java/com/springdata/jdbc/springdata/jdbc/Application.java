package com.springdata.jdbc.springdata.jdbc;

import com.springdata.jdbc.springdata.jdbc.repositories.AccountRepository;
import com.springdata.jdbc.springdata.jdbc.services.TransferService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        AccountRepository accountRepository = context.getBean(AccountRepository.class);
        TransferService transferService = context.getBean(TransferService.class);

        System.out.println(transferService.getAllAccounts());

		transferService.transferMoney(1, 2, new BigDecimal(100));

		System.out.println(transferService.getAllAccounts());
        while (true) ;
    }


}
