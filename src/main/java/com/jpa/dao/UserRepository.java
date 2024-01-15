package com.jpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpa.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
 public List<User> findByName(String name);
 public List<User> findByCity(String city);
 
	

}
