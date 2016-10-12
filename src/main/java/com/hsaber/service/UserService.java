package com.hsaber.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hsaber.domain.SysUser;
import com.hsaber.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public Page<SysUser> findAll(Pageable pageable) {
		return userRepository.findAll(pageable);
	}

	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @return
	 */
	public boolean login(String username, String password) {
		return false;
	}

}
