package com.cg.onlinepizza.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Pizza {
	@Id
	private Integer pizzaId;
	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pizza(Integer pizzaId, PizzaType pizzaType, String pizzaName, String pizzaDescription, Double pizzaCost,
			PizzaSize pizzaSize) {
		super();
		this.pizzaId = pizzaId;
		this.pizzaType = pizzaType;
		this.pizzaName = pizzaName;
		this.pizzaDescription = pizzaDescription;
		this.pizzaCost = pizzaCost;
		this.pizzaSize = pizzaSize;
	}
	@Override
	public String toString() {
		return "Pizza [pizzaId=" + pizzaId + ", pizzaType=" + pizzaType + ", pizzaName=" + pizzaName
				+ ", pizzaDescription=" + pizzaDescription + ", pizzaCost=" + pizzaCost + ", pizzaSize=" + pizzaSize
				+ "]";
	}
	public Integer getPizzaId() {
		return pizzaId;
	}
	public void setPizzaId(Integer pizzaId) {
		this.pizzaId = pizzaId;
	}
	public PizzaType getPizzaType() {
		return pizzaType;
	}
	public void setPizzaType(PizzaType pizzaType) {
		this.pizzaType = pizzaType;
	}
	public String getPizzaName() {
		return pizzaName;
	}
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public String getPizzaDescription() {
		return pizzaDescription;
	}
	public void setPizzaDescription(String pizzaDescription) {
		this.pizzaDescription = pizzaDescription;
	}
	public Double getPizzaCost() {
		return pizzaCost;
	}
	public void setPizzaCost(Double pizzaCost) {
		this.pizzaCost = pizzaCost;
	}
	public PizzaSize getPizzaSize() {
		return pizzaSize;
	}
	public void setPizzaSize(PizzaSize pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	private PizzaType pizzaType;
	private String pizzaName;
	private String pizzaDescription;
	// Base Price
	private Double pizzaCost;
	private PizzaSize pizzaSize;

}
