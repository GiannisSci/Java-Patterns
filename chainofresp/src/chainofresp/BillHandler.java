package chainofresp;


public abstract class BillHandler {

	protected BillHandler successor;
	
	public BillHandler getSuccessor() {
		return successor;
	}

	public void setSuccessor(BillHandler successor) {
		this.successor = successor;
	}

	public abstract void hanldeRequest(int amount);
	
}