package com.jeu.dao;

import java.util.List;

import com.jeu.model.Classe;

public interface DaoGeneric<T, K> {

	List<T> findAll();
	T findByKey(K key);
    void insert(T obj);
    void update(T obj);
    void delete(T obj);
    void deleteByKey(K key);
	

}
