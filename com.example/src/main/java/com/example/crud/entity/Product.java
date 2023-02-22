package com.example.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
//@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product_Tbl")
public class Product {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private int quantity;
	private double price;
}


