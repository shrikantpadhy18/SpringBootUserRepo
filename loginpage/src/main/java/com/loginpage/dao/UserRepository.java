package com.loginpage.dao;

import org.springframework.data.repository.CrudRepository;

import com.loginpage.entities.User;

public interface UserRepository  extends CrudRepository<User,Integer>{

}
