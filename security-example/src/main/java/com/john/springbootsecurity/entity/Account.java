package com.john.springbootsecurity.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "employee_account_details")
public class Account {

    @Id
    @GeneratedValue
    private int id;
    private String bankname;
    private String code;
    private long accno;

    @ManyToOne()
    private User users;
}
