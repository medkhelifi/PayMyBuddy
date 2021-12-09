package com.project.paymybuddy.Domain.DTO;

import com.project.paymybuddy.DAO.User.UserEntity;
import lombok.*;


@Data
public class TransactionDTO {


    private double amount;
    private String beneficiary;
    private String payer;
    private String description;
}
