package com.john.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "Sq",initialValue = 1,allocationSize = 100)
public class placeorder {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Sq")
    private int id;
    private String productname;
    private double price;
}
