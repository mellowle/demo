/**
 * 
 */
package com.orderSys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mello
 */
@Table(name="t_user")
@Entity
public class UserEntity {
	private int id;
	private String username;
	private String password;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, length = 9)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "USERNAME", nullable = false, length = 20)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "UPASSWORD", nullable = false, length = 32)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


//	@Override
//	public String toString() {
//		return "User [ \nid : " + this.id + "\nusername : " + this.username
//				+ "\npassword : " + this.password + " ]";
//	}

}
