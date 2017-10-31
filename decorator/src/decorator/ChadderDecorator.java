package decorator;

public class ChadderDecorator extends ToppingDecorator{

	public ChadderDecorator(Pizza pizza) {
		super(pizza);

	}

	@Override
	public String getDetails() {
		return basePizza.getDetails() + " chadder";
	}

	@Override
	public double getPrice() {
		return basePizza.getPrice() + 0.5;
	}
	
	

}
