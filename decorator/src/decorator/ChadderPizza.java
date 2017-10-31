package decorator;

// BAD ....
public class ChadderPizza extends BasePizza {
	@Override
	public String getDetails() {
		return "Chadder Pizza with thin doe";
	}

	@Override
	public double getPrice() {
		return 4.5;
	}
}
