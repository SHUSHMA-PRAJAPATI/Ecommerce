package com.admin.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int productId;
	 private int vendorId;
	 private String productName;
	 private String productCategory;
	 private String productImage;
	 private String productDescription;
	 private String productStatus;
	 private int productPrice;
	 
	 @ManyToOne
	 private Category category;
	public Product() {
		super();
	}
	public Product(int vendorId, String productName, String productCategory, String productImage,
			String productDescription, String productStatus, int productPrice,Category category) {
		super();
		this.vendorId = vendorId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productImage = productImage;
		this.productDescription = productDescription;
		this.productStatus = productStatus;
		this.productPrice = productPrice;
		this.category = category;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", vendorId=" + vendorId + ", productName=" + productName
				+ ", productCategory=" + productCategory + ", productImage=" + productImage + ", productDescription="
				+ productDescription + ", productStatus=" + productStatus + ", productPrice=" + productPrice + "]";
	}
	 
	 
	 
}
