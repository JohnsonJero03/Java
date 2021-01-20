package com.john.springbootsecurity.controller;

import com.john.springbootsecurity.entity.Account;
import com.john.springbootsecurity.entity.Account_;
import com.john.springbootsecurity.entity.User;
import com.john.springbootsecurity.entity.User_;
import com.john.springbootsecurity.repository.registerUserRepo;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
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
public class userRegister {

    @Autowired
    private registerUserRepo registerUserRepo;
    @PersistenceContext
    private EntityManager em;
    @PostMapping("/employee/details/add")
    public User addUserDetails(@RequestBody User user) {
//        user.setPassword(password.passwordEncoder().encode(user.getPassword()));
        return registerUserRepo.save(user);
    }

    @GetMapping("/employee/show")
    public List<User> showEmployee() {
        return registerUserRepo.findAll();
    }

    @GetMapping("/employeeandacc/show")
    public void getUser()
    {
//        Account account  = new Account();
//            User user_ = new User();
            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<Tuple> q = builder.createQuery(Tuple.class);
            Root<User>  user = q.from(User.class);
            Join<User,Account> acc = user.join(User_.accounts);
            q.multiselect(user.get(User_.USERNAME).alias("username"),user.get(User_.FIRSTNAME).alias("firstname"),acc.get(Account_.BANKNAME).alias("bankname"));


        ParameterExpression<String> firstname = builder.parameter(String.class);
        q.where(builder.like(user.get(User_.FIRSTNAME), firstname));

          TypedQuery<Tuple> tq = em.createQuery(q);
        tq.setParameter(firstname, "%AAAA%");
          List<Tuple> userlist = tq.getResultList();

          for(Tuple u : userlist)
          {
              log.info("something");
              log.info("Username:{}",u.get("username"));
              log.info("Firstname:{}",u.get("firstname"));
              log.info("Bankname:{}",u.get("bankname"));
          }

//        CriteriaBuilder cb = em.getCriteriaBuilder();
//
////        CriteriaQuery<Tuple> q = cb.createQuery(Tuple.class);
//
//        CriteriaQuery<User> q = cb.createQuery(User.class);
//        Root<User> c = q.from(User.class);
//        q.select(c);
////        q.select(c.get(user_.getLastname()));
////        q.select(c.get(user_.getMailID()));
//        q.multiselect(c.get(user_.getFirstname()).alias("firstname"),c.get(user_.getAddress()).alias("Address"),c.get(user_.getLastname()).alias("lastname"));
//         q.select(cb.construct(User.class,c.get("firstname"),c.get("lastname")));
//        TypedQuery<User> list = em.createQuery(q);
//
//        List<User> userlist = list.getResultList();
//
////        TypedQuery<Tuple> list = em.createQuery(q);
////
////        List<Tuple> userlist = list.getResultList();
//        for(User u : userlist)
//        {
//
//            log.info("firstname:{}",u.getFirstname());
//            log.info("Address:{}",u.getAddress());
//            log.info("lastname:{}",u.getLastname());
//            log.info("mailid:{}",u.getMailID());
////            log.info(String.valueOf(u));
//
//        }

    }
}