package chainofresp;

public class BillHandler10 extends BillHandler{

	@Override
	public void hanldeRequest(int amount) {
		if (amount == 0)
			return;
		if (amount < 10)
		{
			if (successor == null)
			{
				System.out.println("Cannot solve!");
				return;
			}
			successor.hanldeRequest(amount);
			return;
		}
		if (amount > 10)
		{
			System.out.println("Giving " + amount / 10
					+ " bill of 100");
			if (amount % 10 != 0)
			{
				if (successor == null)
				{
					System.out.println("Cannot solve!");
					return;
				}
				successor.hanldeRequest(amount % 10);
				return;
			}
		}
		if (amount == 10)
		{
			System.out.println("Giving 10 bill");
			return;
		}
	}

	
	
}
