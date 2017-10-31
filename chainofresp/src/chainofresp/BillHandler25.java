package chainofresp;

public class BillHandler25 extends BillHandler{

	@Override
	public void hanldeRequest(int amount) {
		if (amount == 0)
			return;
		if (amount < 25)
		{
			if (successor == null)
			{
				System.out.println("Cannot solve!");
				return;
			}
			successor.hanldeRequest(amount);
			return;
		}
		if (amount > 25)
		{
			System.out.println("Giving " + amount / 25
					+ " bill of 25");
			if (amount % 25 != 0)
			{
				if (successor == null)
				{
					System.out.println("Cannot solve!");
					return;
				}
				successor.hanldeRequest(amount % 25);
				return;
			}
		}
		if (amount == 25)
		{
			System.out.println("Giving 25 bill");
			return;
		}
	}

	
	
}


