package com.john.springbootsecurity.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor", date = "2021-01-20T19:54:59.936+0530")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, String> firstname;
	public static volatile SingularAttribute<User, String> address;
	public static volatile SingularAttribute<User, String> mailID;
	public static volatile SingularAttribute<User, Integer> id;
	public static volatile ListAttribute<User, Account> accounts;
	public static volatile SingularAttribute<User, Integer> age;
	public static volatile SingularAttribute<User, String> lastname;
	public static volatile SingularAttribute<User, String> username;

	public static final String FIRSTNAME = "firstname";
	public static final String ADDRESS = "address";
	public static final String MAIL_ID = "mailID";
	public static final String ID = "id";
	public static final String ACCOUNTS = "accounts";
	public static final String AGE = "age";
	public static final String LASTNAME = "lastname";
	public static final String USERNAME = "username";

}

