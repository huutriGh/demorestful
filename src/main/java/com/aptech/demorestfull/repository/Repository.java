package com.aptech.demorestfull.repository;

public interface Repository<T, TId> {

    public boolean add(T entity);

    public boolean update(T entity);

    public T getById(TId id);

    public  void setType(Class<T> type);


}
