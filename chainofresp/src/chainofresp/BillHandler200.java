package chainofresp;

public class BillHandler200 extends BillHandler{

	@Override
	public void hanldeRequest(int amount) {
		if (amount == 0)
			return;
		if (amount < 200)
		{
			if (successor == null)
			{
				System.out.println("Cannot solve!");
				return;
			}
			successor.hanldeRequest(amount);
			return;
		}
		if (amount > 200)
		{
			System.out.println("Giving " + amount / 200
					+ " bill of 200");
			if (amount % 200 != 0)
			{
				if (successor == null)
				{
					System.out.println("Cannot solve!");
					return;
				}
				successor.hanldeRequest(amount % 200);
				return;
			}
		}
		if (amount == 200)
		{
			System.out.println("Giving 200 bill");
			return;
		}
	}

	
	
}