package com.database.dao;

import java.sql.SQLException;
import java.util.List;

public interface DaoGeneric<T, K>  {
	
    List<T> findAll();
    T findByKey(K key);
    void insert(T obj);
    T update(T obj);
    void delete(T obj);
    void deleteByKey(K key);
    
}
