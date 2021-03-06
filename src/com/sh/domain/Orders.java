package com.sh.domain;
// Generated 2017-10-25 16:26:02 by Hibernate Tools 5.2.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Orders generated by hbm2java
 */
public class Orders implements java.io.Serializable {

	private String oid;
	private Date ordertime;
	private Double total;
	private Integer state;
	private String address;
	private String name;
	private String telephone;
	private String uid;
	private Set orderitems = new HashSet(0);

	public Orders() {
	}

	public Orders(String oid) {
		this.oid = oid;
	}

	public Orders(String oid, Date ordertime, Double total, Integer state, String address, String name,
			String telephone, String uid, Set orderitems) {
		this.oid = oid;
		this.ordertime = ordertime;
		this.total = total;
		this.state = state;
		this.address = address;
		this.name = name;
		this.telephone = telephone;
		this.uid = uid;
		this.orderitems = orderitems;
	}

	public String getOid() {
		return this.oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public Date getOrdertime() {
		return this.ordertime;
	}

	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Set getOrderitems() {
		return this.orderitems;
	}

	public void setOrderitems(Set orderitems) {
		this.orderitems = orderitems;
	}

}
