package com.esite.dto;

public class BuyItemDTO {
	private int id;
	private String itemname;
	private String itemprice;

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getItemname(){
		return itemname;
	}

	public void setItemname(String itemname){
		this.itemname = itemname;
	}

	public String getItemprice(){
		return itemprice;
	}

	public void setItemprice(String itemprice){
		this.itemprice = itemprice;
	}

}
