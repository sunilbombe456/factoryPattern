package factoryPattern;

import factoryPattern.abst.Pizza;
import factoryPattern.abst.impl.CheesePizza;
import factoryPattern.abst.impl.ClamPizza;
import factoryPattern.abst.impl.PepperoniPizza;
import factoryPattern.abst.impl.VeggiePizza;

public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		  Pizza pizza = null;

		if (type.equals("cheese")) {
		pizza = new CheesePizza();
		  } else if (type.equals("pepperoni")) {
		pizza = new PepperoniPizza();
		  } else if (type.equals("clam")) {
		pizza = new ClamPizza();
		  } else if (type.equals("veggie")) {
		pizza = new VeggiePizza();
		  }
		return pizza;
		 }

}
