package com.john.springboot.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor", date = "2021-01-21T18:51:40.980+0530")
@StaticMetamodel(placeorder.class)
public abstract class placeorder_ {

	public static volatile SingularAttribute<placeorder, Double> price;
	public static volatile SingularAttribute<placeorder, String> productname;
	public static volatile SingularAttribute<placeorder, Integer> id;

	public static final String PRICE = "price";
	public static final String PRODUCTNAME = "productname";
	public static final String ID = "id";

}

