package com.roomrockers.productservice.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
//@Component
//@Scope(value="prototype")
@Entity
@Table(name ="product_tbl", schema = "product_schema")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID uid;
	//@Column(name = "product_name")
	private String productName;
	//@Column(name = "product_description")
	private String productDescription;
	//@Column(name = "product_price")
	private BigDecimal productPrice;
	//@Column(name = "manufactured_date")
	private Date manufacturedDate;
	//@Column(name = "expiry_date")
	private Date expiryDate;
	//@Column(name = "product_type")
	private String productType;
	public UUID getUid() {
		return uid;
	}
	public void setUid(UUID uid) {
		this.uid = uid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public BigDecimal getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}
	public Date getManufacturedDate() {
		return manufacturedDate;
	}
	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public Product() {
		super();
	}
	
	//private Manufacturer manufacturer;
	
	
}
