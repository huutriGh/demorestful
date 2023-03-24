package com.aptech.demorestfull.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lombok.extern.slf4j.Slf4j;




public class RepositoryImpl<T, Tid> implements Repository<T, Tid> {

    private Class<T> type;
    private EntityManager entityManager;

    public RepositoryImpl() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public boolean add(T entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
            return  true;
        }catch (Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            return  false;
        }

    }

    @Override
    public boolean update(T entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(entity);
            entityManager.getTransaction().commit();
            return  true;
        }catch (Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            return  false;
        }
    }

    @Override
    public T getById(Tid tid) {
        return entityManager.find(type, tid);
    }

    @Override
    public void setType(Class<T> type) {
        this.type = type;
    }
}
