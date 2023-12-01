package com.cg.onlinepizza;

import java.util.List;

import com.cg.onlinepizza.entity.Pizza;
import com.cg.onlinepizza.entity.PizzaType;

public interface IPizzaService {

	
	Pizza addPizza(Pizza pizza);

	Toppings addToppings(Toppings toppings);

	PizzaType addPizzaTypa(PizzaType pizzaType);

	Pizza updatePizza(Pizza pizza);

	Pizza viewPizzaById(Integer pizzaId);

	List<Pizza> viewPizzaByPizzaType(String pizzaType);

	List<Pizza> viewPizzaByPizzaSize(String pizzaSize);

	List<Pizza> viewPizzaByPrice(Double minPrice, Double maxPrice);

	List<Pizza> viewAllPizza();

	List<Toppings> viewToppings();

	Toppings viewToppingByID(Integer toppingsID);

	PizzaType viewPizzaTypeById(Integer pizzaTypeId);

	List<PizzaType> viewAllPizzaTypes();

}

