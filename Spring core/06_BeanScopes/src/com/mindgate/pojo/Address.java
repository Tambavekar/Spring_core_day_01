package com.mindgate.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 
@Scope("prototype")  // with the help of scope we can share multiple obj
public class Address {
	private int addressId;
	private String houseNumber;
	private String buildingName;
	private String stree;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getStree() {
		return stree;
	}

	public void setStree(String stree) {
		this.stree = stree;
	}

	public Address() {
		System.out.println("default constructor of address class");
		// TODO Auto-generated constructor stub
	}

	public Address(int addressId, String houseNumber, String buildingName, String stree) {
		super();
		this.addressId = addressId;
		this.houseNumber = houseNumber;
		this.buildingName = buildingName;
		this.stree = stree;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", houseNumber=" + houseNumber + ", buildingName=" + buildingName
				+ ", stree=" + stree + "]";
	}

}
