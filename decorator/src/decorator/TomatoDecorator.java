package decorator;

public class TomatoDecorator extends ToppingDecorator{

	public TomatoDecorator(Pizza pizza) {
		super(pizza);

	}

	@Override
	public String getDetails() {
		return basePizza.getDetails() + " tomato";
	}

	@Override
	public double getPrice() {
		return basePizza.getPrice() + 0.5;
	}
	
	

}
