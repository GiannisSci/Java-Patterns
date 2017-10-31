package decorator;

public class SupremeDecorator extends ToppingDecorator{

	public SupremeDecorator(Pizza pizza) {
		super(pizza);

	}

	@Override
	public String getDetails() {
		return basePizza.getDetails() + " supreme";
	}

	@Override
	public double getPrice() {
		return basePizza.getPrice() + 1.5;
	}
	
	

}

