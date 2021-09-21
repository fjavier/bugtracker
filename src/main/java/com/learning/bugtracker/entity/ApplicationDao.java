package com.learning.bugtracker.entity;

import com.learning.bugtracker.dao.IApplicationDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class ApplicationDao implements IApplicationDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void addApplication(ApplicationEntity applicationEntity) {
        entityManager.persist(applicationEntity);
    }
}
