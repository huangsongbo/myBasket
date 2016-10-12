package com.hsaber.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsaber.domain.SysUser;

public interface UserRepository extends JpaRepository<SysUser, Long>{

	Optional<SysUser> findOneByUsername(String username);

}
