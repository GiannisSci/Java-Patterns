package decorator;

public class Main {

	public static void main(String[] args) {
		Pizza basePizza = new BasePizza();
		System.out.println(basePizza.getDetails());
		System.out.println(basePizza.getPrice());
		
		basePizza = new ChadderDecorator(basePizza);
		System.out.println(basePizza.getDetails());
		System.out.println(basePizza.getPrice());
		
		basePizza = new TomatoDecorator(basePizza);
		System.out.println(basePizza.getDetails());
		System.out.println(basePizza.getPrice());	
		
		Pizza basePizzaOneLine = new TomatoDecorator(
				new ChadderDecorator(new BasePizza()));
		
		basePizza = new SupremeDecorator(basePizza);
		System.out.println(basePizza.getDetails());
		System.out.println(basePizza.getPrice());	
		
	}
	
	

}
