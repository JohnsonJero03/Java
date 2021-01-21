package com.john.springboot.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor", date = "2021-01-21T18:39:51.622+0530")
@StaticMetamodel(address.class)
public abstract class address_ {

	public static volatile SingularAttribute<address, String> currentaddress;
	public static volatile SingularAttribute<address, String> permenantaddress;
	public static volatile SingularAttribute<address, Integer> id;

	public static final String CURRENTADDRESS = "currentaddress";
	public static final String PERMENANTADDRESS = "permenantaddress";
	public static final String ID = "id";

}

