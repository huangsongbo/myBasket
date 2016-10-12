package com.hsaber.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sys_authority")
public class SysAuthority extends BasicEntity implements Serializable{

	private static final long serialVersionUID = -1171381819122988686L;
	
	public enum AuthorityName {
	    ROLE_USER, ROLE_ADMIN
	}
	
	@Column(name="name", length=100,nullable=false,unique=true)
	private AuthorityName name;

	public AuthorityName getName() {
		return name;
	}

	public void setName(AuthorityName name) {
		this.name = name;
	}
	
}
