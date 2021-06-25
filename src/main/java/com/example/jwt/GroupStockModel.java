package com.example.jwt;

public class GroupStockModel {

	private String gr;
	private String qty;
	
	public GroupStockModel() {
		// TODO Auto-generated constructor stub
	}
	
	public GroupStockModel(String gr, String qty) {
		super();
		this.gr = gr;
		this.qty = qty;
	}
	public String getGr() {
		return gr;
	}
	public void setGr(String gr) {
		this.gr = gr;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}

	
}
