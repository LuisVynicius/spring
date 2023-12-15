package com.educandoweb.coursedois.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursedois.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}