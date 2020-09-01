package com.demo.eligibility2;

import java.util.Arrays;

public class Customer {
	String name;
	String[] existingProducts;
	int combinedBalance;
	String profile;
	String recommendation;
	String offeredProducts;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getExistingProducts() {
		return existingProducts;
	}
	public void setExistingProducts(String[] existingProducts) {
		this.existingProducts = existingProducts;
	}
	public int getCombinedBalance() {
		return combinedBalance;
	}
	public void setCombinedBalance(int combinedBalance) {
		this.combinedBalance = combinedBalance;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}
	public String getOfferedProducts() {
		return offeredProducts;
	}
	public void setOfferedProducts(String offeredProducts) {
		this.offeredProducts = offeredProducts;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", existingProducts=" + Arrays.toString(existingProducts)
				+ ", combinedBalance=" + combinedBalance + ", profile=" + profile + ", recommendation=" + recommendation
				+ ", offeredProducts=" + offeredProducts + "]";
	}
}
