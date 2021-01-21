package com.john.springboot.controller;

import com.john.springboot.entity.*;
import com.john.springboot.repository.customerRepo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.List;


@RestController
@Slf4j
public class customerController {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private customerRepo customerRepo;

    @PostMapping("/customer/add")
    public customer addCustomer(@RequestBody customer customer)
    {
        return  customerRepo.save(customer);
    }

    @GetMapping("/customer/show")
    public void getCustomerDetails()
    {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Tuple> cq = builder.createQuery(Tuple.class);
        Root<customer> roottable =  cq.from(customer.class);
        Join<customer, address>  addresses =  roottable.join(customer_.addresses);
        Join<customer, placeorder> order = roottable.join(customer_.placeorders);
        cq.multiselect(roottable.get(customer_.FIRSTNAME).alias("firstname"),roottable.get(customer_.LASTNAME).alias("lastname"),roottable.get(customer_.MAILID).alias("mailid"),addresses.get(address_.PERMENANTADDRESS).alias("address"),order.get(placeorder_.PRODUCTNAME).alias("productname"));

//        ParameterExpression<String> firstname = builder.parameter(String.class);
//        cq.where(builder.like(roottable.get(customer_.FIRSTNAME),firstname));

        TypedQuery<Tuple> tq = em.createQuery(cq);
//        tq.setParameter(firstname,"%Johnson%");

        List<Tuple> userDetails = tq.getResultList();

        for(Tuple t : userDetails)
        {
            log.info("firstname:{}",t.get("firstname"));
            log.info("lastname:{}",t.get("lastname"));
            log.info("mailid:{}",t.get("mailid"));
            log.info("address:{}",t.get("address"));
            log.info("productname:{}",t.get("productname"));
        }
    }
}
