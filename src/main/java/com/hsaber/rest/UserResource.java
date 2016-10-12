package com.hsaber.rest;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hsaber.domain.SysUser;
import com.hsaber.rest.util.PaginationUtil;
import com.hsaber.service.UserService;

@RestController
public class UserResource {

	@Autowired
	private UserService userService;
	
	/**
	 * 查询用户列表
	 * @author huangsongbo
	 * @param pageable
	 * @return
	 * @throws URISyntaxException
	 */
	@RequestMapping(value="/api/users",method=RequestMethod.GET)
	public ResponseEntity<List<SysUser>> findAll(Pageable pageable) throws URISyntaxException{
		Page<SysUser> page=userService.findAll(pageable);
		HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/users");
		return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
	}
	
	/**
	 * 登录接口
	 * @author huangsongbo
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/api/login",method=RequestMethod.POST)
	public ResponseEntity<SysUser> login(SysUser user){
		boolean flag=userService.login(user.getUsername(),user.getPassword());
		return null;
	}
	
}
