package com.john.springboot.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor", date = "2021-01-21T18:51:40.974+0530")
@StaticMetamodel(customer.class)
public abstract class customer_ {

	public static volatile SingularAttribute<customer, String> firstname;
	public static volatile ListAttribute<customer, address> addresses;
	public static volatile SingularAttribute<customer, String> gender;
	public static volatile SingularAttribute<customer, String> mailid;
	public static volatile SingularAttribute<customer, Integer> id;
	public static volatile ListAttribute<customer, placeorder> placeorders;
	public static volatile SingularAttribute<customer, Integer> age;
	public static volatile SingularAttribute<customer, String> lastname;
	public static volatile SingularAttribute<customer, String> username;

	public static final String FIRSTNAME = "firstname";
	public static final String ADDRESSES = "addresses";
	public static final String GENDER = "gender";
	public static final String MAILID = "mailid";
	public static final String ID = "id";
	public static final String PLACEORDERS = "placeorders";
	public static final String AGE = "age";
	public static final String LASTNAME = "lastname";
	public static final String USERNAME = "username";

}

