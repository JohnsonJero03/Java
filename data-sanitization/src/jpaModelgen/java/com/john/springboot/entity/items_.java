package com.john.springboot.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor", date = "2021-01-21T18:51:40.970+0530")
@StaticMetamodel(items.class)
public abstract class items_ {

	public static volatile SingularAttribute<items, String> quantity;
	public static volatile SingularAttribute<items, String> pname;
	public static volatile SingularAttribute<items, Double> price;
	public static volatile SingularAttribute<items, Integer> id;

	public static final String QUANTITY = "quantity";
	public static final String PNAME = "pname";
	public static final String PRICE = "price";
	public static final String ID = "id";

}

