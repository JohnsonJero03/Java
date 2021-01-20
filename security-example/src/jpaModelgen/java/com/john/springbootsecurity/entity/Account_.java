package com.john.springbootsecurity.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor", date = "2021-01-20T20:12:08.123+0530")
@StaticMetamodel(Account.class)
public abstract class Account_ {

	public static volatile SingularAttribute<Account, String> code;
	public static volatile SingularAttribute<Account, Long> accno;
	public static volatile SingularAttribute<Account, Integer> id;
	public static volatile SingularAttribute<Account, String> bankname;
	public static volatile SingularAttribute<Account, User> users;

	public static final String CODE = "code";
	public static final String ACCNO = "accno";
	public static final String ID = "id";
	public static final String BANKNAME = "bankname";
	public static final String USERS = "users";

}

