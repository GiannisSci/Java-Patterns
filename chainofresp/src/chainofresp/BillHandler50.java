package chainofresp;

public class BillHandler50 extends BillHandler{

	@Override
	public void hanldeRequest(int amount) {
		if (amount == 0)
			return;
		if (amount < 50)
		{
			if (successor == null)
			{
				System.out.println("Cannot solve!");
				return;
			}
			successor.hanldeRequest(amount);
			return;
		}
		if (amount > 50)
		{
			System.out.println("Giving " + amount / 50
					+ " bill of 50");
			if (amount % 50 != 0)
			{
				if (successor == null)
				{
					System.out.println("Cannot solve!");
					return;
				}
				successor.hanldeRequest(amount % 50);
				return;
			}
		}
		if (amount == 50)
		{
			System.out.println("Giving 50 bill");
			return;
		}
	}

	
	
}