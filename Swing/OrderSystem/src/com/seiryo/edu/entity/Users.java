package com.seiryo.edu.entity;

public class Users {
	private int id;
    private String name;
    private String password;
    private String email;
    public Users( String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Users( String name, String password, String email) {
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public Users() {
		super();
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", password=" + password
				+ ", email=" + email + "]";
	}
    
}
