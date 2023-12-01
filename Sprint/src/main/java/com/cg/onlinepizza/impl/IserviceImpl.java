package com.cg.onlinepizza.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlinepizza.IPizzaService;
import com.cg.onlinepizza.Toppings;
import com.cg.onlinepizza.entity.Pizza;
import com.cg.onlinepizza.entity.PizzaType;
import com.onlinepizza.repository.PizzaRepo;

@Service
public class IserviceImpl implements IPizzaService   {
	
	@Autowired
	private PizzaRepo pizzarepo;
	
	@Override
	public Pizza addPizza(Pizza pizza) {
		
		return pizzarepo.save(pizza);
	}

	@Override
	public Toppings addToppings(Toppings toppings) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PizzaType addPizzaTypa(PizzaType pizzaType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pizza updatePizza(Pizza pizza) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pizza viewPizzaById(Integer pizzaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pizza> viewPizzaByPizzaType(String pizzaType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pizza> viewPizzaByPizzaSize(String pizzaSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pizza> viewPizzaByPrice(Double minPrice, Double maxPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pizza> viewAllPizza() {
		// TODO Auto-generated method stub
		return IPizzaService.;
	}

	@Override
	public List<Toppings> viewToppings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Toppings viewToppingByID(Integer toppingsID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PizzaType viewPizzaTypeById(Integer pizzaTypeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PizzaType> viewAllPizzaTypes() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
