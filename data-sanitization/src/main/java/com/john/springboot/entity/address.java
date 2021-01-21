package com.john.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@SequenceGenerator(name = "seq",initialValue = 1,allocationSize = 100)
public class address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "seq")
    private  int id;
    private String currentaddress;
    private String permenantaddress;

//    private
}
