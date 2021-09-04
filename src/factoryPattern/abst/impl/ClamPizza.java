package factoryPattern.abst.impl;

import factoryPattern.abst.Pizza;

public class ClamPizza extends Pizza {

	public ClamPizza() {
		name = "Clam Pizza";
		dough = "Thin crust";
		sauce = "White garlic sauce";
		toppings.add("Clams");
		toppings.add("Grated parmesan cheese");
	}

}
