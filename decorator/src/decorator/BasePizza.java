package decorator;

public class BasePizza implements Pizza {

	@Override
	public String getDetails() {
		return "Thin doe";
	}

	@Override
	public double getPrice() {
		return 4.0;
	}

}
