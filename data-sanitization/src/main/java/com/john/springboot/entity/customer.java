package com.john.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@SequenceGenerator(name = "seq",initialValue = 1,allocationSize = 100)
public class customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "seq")
    private int id;
    private String firstname;
    private String lastname;
    private String username;
    private String mailid;
    private int age;
    private String gender;

    @OneToMany(targetEntity = address.class,cascade = CascadeType.ALL)
    @JoinColumn(name="customer_id",referencedColumnName = "id",nullable = false)
    private List<address> addresses;

//    @OneToMany(targetEntity = order.class,cascade = CascadeType.ALL)
//    @JoinColumn(name = "order_customer_id",referencedColumnName = "id",nullable = false)
//    private  List<order> orders;

    @OneToMany(targetEntity = placeorder.class,cascade =CascadeType.ALL)
    @JoinColumn(name = "o_customer_id",referencedColumnName = "id",nullable = false)
    private  List<placeorder> placeorders;
}
