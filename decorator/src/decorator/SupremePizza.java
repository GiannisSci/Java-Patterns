package decorator;

public class SupremePizza  extends BasePizza {
	@Override
	public String getDetails() {
		return "Supreme Pizza with thin doe";
	}

	@Override
	public double getPrice() {
		return 5.5;
	}
}


