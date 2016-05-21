package mytime;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class user {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	String name;
	String email;
}
