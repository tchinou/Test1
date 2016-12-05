package dao;

import java.util.ArrayList;

public interface Dao<T> {

	ArrayList<T> findAll();
	boolean insert(T nouveau);
	T FindByid(int id);
	boolean delete(int id);
	



}
