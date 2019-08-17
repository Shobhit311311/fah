package com.cg.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="product")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer productID;
	
	@Column
	private String productName;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Merchant.merchantId")
	private Merchant merchant;
	
	@ElementCollection
	private List<String> tag;
	
	@Column 
	private String company;
	
	@Column
	private String photo;
	
	@Column 
	private String description;
	
	@Column(length=5)
	private Integer quantity;
	
	@Column
	private String category;
	
	@Column
	private String subcategory;
	
	@Column
	private Integer soldQuantities;
	
	@Column
	private Integer price;
	
	
	private Date releaseDate;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}}
