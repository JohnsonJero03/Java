package com.john.springboot.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data

public class items {

    @Id
    private int id;
    private String pname;
    private String quantity;
    private double price;
}
