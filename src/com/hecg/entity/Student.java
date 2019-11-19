package com.hecg.entity;

import com.hecg.annotation.Property;
import com.hecg.annotation.Table;

/**
 * 功能：学生实体类
 *
 * @author hecg
 * @version 2019年11月13日
 */
@Table(value = "student")
public class Student {
	@Property(name = "id", length = 20)
	private Long id;

	@Property(name = "user_name")
	private String userName;

	@Property(name = "user_pwd")
	private String userPwd;

	@Property(name = "age")
	private Integer age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
