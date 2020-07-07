package com.heping.DAO;

import com.heping.Entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<User> findAll() {
        Query query = entityManager.createQuery("from User");
        return query.getResultList();
    }
}
