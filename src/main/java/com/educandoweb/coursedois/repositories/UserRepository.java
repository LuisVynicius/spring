package com.educandoweb.coursedois.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.coursedois.entities.User;
//Não precisa por causa do extends
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}