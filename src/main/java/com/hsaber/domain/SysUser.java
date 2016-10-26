package com.hsaber.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 用户
 * @author huangsongbo
 *
 */
@Entity
@Table(name="sys_user")
public class SysUser extends BasicEntity implements Serializable{
	
	private static final long serialVersionUID = -710785326990419817L;

	/*用户名*/
	@Column(name="username",length=100,nullable=false,unique=true)
	private String username;
	
	/*密码*/
	@Column(name="password",length=200,nullable=false)
	@JsonIgnore
	private String password;
	
	/*昵称*/
	@Column(name="nickname",length=100)
	private String nickname;
	
	/*手机号*/
	@Column(name="mobile",length=20)
	private String mobile;

	@ManyToMany
    @JoinTable(
            name = "sys_user_authority",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_id", referencedColumnName = "id")})
	private List<SysAuthority> authorities;
	
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
