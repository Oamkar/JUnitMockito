package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Purchase {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String partnerId;
	private String componentName;
	private String purchaseToken;
	private String purchaseCategory;
	private String purchaseMode;
	
	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getComponentName() {
		return componentName;
	}
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	public String getPurchaseToken() {
		return purchaseToken;
	}
	public void setPurchaseToken(String purchaseToken) {
		this.purchaseToken = purchaseToken;
	}
	public String getPurchaseCategory() {
		return purchaseCategory;
	}
	public void setPurchaseCategory(String purchaseCategory) {
		this.purchaseCategory = purchaseCategory;
	}
	public String getPurchaseMode() {
		return purchaseMode;
	}
	public void setPurchaseMode(String purchaseMode) {
		this.purchaseMode = purchaseMode;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
