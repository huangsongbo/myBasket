package com.hsaber.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsaber.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
