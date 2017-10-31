package pTemplete;

public class RunSpecialQuery extends TemplateQuery{

	@Override
	protected String connectToDB(String conn)
	{
		return "Connected";
	}
	
	@Override
	protected String runTheQuery(String query) {
		System.out.println("Run " + query);
		return "employee special";
	}

	
}
