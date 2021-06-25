package com.example.jwt;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="stock_table")
public class BloodStockModel {
	
	@Id
	private String id;
	private String group;
	private String qty;
	private LocalDate date;
	
	public BloodStockModel() {
		
	}
	
	public BloodStockModel(String id, String group, String qty, LocalDate date) {
		super();
		this.id = id;
		this.group = group;
		this.qty = qty;
		this.date = date;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	

}
