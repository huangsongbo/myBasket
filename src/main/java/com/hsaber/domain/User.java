package com.hsaber.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 用户
 * @author huangsongbo
 *
 */
@Entity
@Table(name="user")
public class User extends BasicEntity implements Serializable{
	
	private static final long serialVersionUID = -710785326990419817L;

	/*用户名*/
	@Column(name="username",nullable=false,unique=true)
	private String username;
	
	/*密码*/
	@Column(name="password",nullable=false)
	private String password;
	
	/*昵称*/
	@Column(name="nickname")
	private String nickname;
	
	/*手机号*/
	@Column(name="mobile")
	private String mobile;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
