package com.cg.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="return")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Return {
	
	@Id
	@Column(name="returnId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int returnId;
	
//	@Column(name="orderId")
	@OneToOne(targetEntity=Transaction.class)
	private Transaction transaction;
	
//	@Column(name="productId")
	@OneToOne(targetEntity=Product.class)
	private Product product;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date pickupDate;
	
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	private String returnStatus;

	public int getReturnId() {
		return returnId;
	}
	public void setReturnId(int returnId) {
		this.returnId = returnId;
	}
//	public Transaction getOrder() {
//		return transaction;
//	}
//	public void setOrder(Transaction order) {
//		this.transaction = order;
//	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Date getPickupDate() {
		return pickupDate;
	}
	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}
	public String getReturnStatus() {
		return returnStatus;
	}
	public void setReturnStatus(String returnStatus) {
		this.returnStatus = returnStatus;
	}


	public Return() {
		super();
	}

	@Override
	public String toString() {
		return "Return [returnId=" + returnId + ", Transaction=" + transaction + ", product=" + product + ", pickupDate="
				+ pickupDate + ", returnStatus=" + returnStatus + "]";
	}
	public Return(int returnId, Transaction transaction, Product product, Date pickupDate, String returnStatus) {
		super();
		this.returnId = returnId;
		this.transaction = transaction;
		this.product = product;
		this.pickupDate = pickupDate;
		this.returnStatus = returnStatus;
	}
	
}