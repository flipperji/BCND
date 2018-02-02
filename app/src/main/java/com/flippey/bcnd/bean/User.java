package com.flippey.bcnd.bean;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "t_user")
public class User {
	@DatabaseField(id = true)
	private int id;
	@DatabaseField(columnName = "name")
	private String name;
	@DatabaseField(columnName = "balance")
	private float balance;
	@DatabaseField(columnName = "yesterdayBalance")
	private float yesterdayBalance;
	@DatabaseField(columnName = "status")
	private int status;
	@DatabaseField(columnName = "phone")
	private int phone;
	@DatabaseField(columnName = "token")
	private String token;
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

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public float getYesterdayBalance() {
		return yesterdayBalance;
	}

	public void setYesterdayBalance(float yesterdayBalance) {
		this.yesterdayBalance = yesterdayBalance;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public User() {
	}

	public User(int id, String name, float balance, float yesterdayBalance, int status, int phone, String token) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.yesterdayBalance = yesterdayBalance;
		this.status = status;
		this.phone = phone;
		this.token = token;
	}
}
