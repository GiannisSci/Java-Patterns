package decorator;

public abstract class ToppingDecorator implements Pizza{

	protected Pizza basePizza;
	public ToppingDecorator(Pizza pizza)
	{
		this.basePizza = pizza;
	}
	
}
