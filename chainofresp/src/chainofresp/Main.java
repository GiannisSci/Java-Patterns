package chainofresp;

public class Main {

	public static void main(String[] args) {
		
		// Setting the start of the chain
		BillHandler start = new BillHandler200();
		BillHandler do100 = new BillHandler100();
		BillHandler do50  = new BillHandler50();
		BillHandler do25 = new BillHandler25();
		
//		BillHandler do10 = new BillHandler()
//		{
//
//			@Override
//			public void hanldeRequest(int amount) {
//				// TODO Auto-generated method stub
//				
//				do25.setSuccessor(do10);
//				
//			}
//		
//		}
		
		// Setting successors
		start.setSuccessor(do100);
		do100.setSuccessor(do50);
		do50.setSuccessor(do25);
		
		// Calling the start of the chain
		start.hanldeRequest(440);
		

	}

}