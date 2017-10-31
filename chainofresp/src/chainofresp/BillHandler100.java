package chainofresp;

public class BillHandler100 extends BillHandler{

	@Override
	public void hanldeRequest(int amount) {
		if (amount == 0)
			return;
		if (amount < 100)
		{
			if (successor == null)
			{
				System.out.println("Cannot solve!");
				return;
			}
			successor.hanldeRequest(amount);
			return;
		}
		if (amount > 100)
		{
			System.out.println("Giving " + amount / 100
					+ " bill of 100");
			if (amount % 100 != 0)
			{
				if (successor == null)
				{
					System.out.println("Cannot solve!");
					return;
				}
				successor.hanldeRequest(amount % 100);
				return;
			}
		}
		if (amount == 100)
		{
			System.out.println("Giving 100 bill");
			return;
		}
	}

	
	
}