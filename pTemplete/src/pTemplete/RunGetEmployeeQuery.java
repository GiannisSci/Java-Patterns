package pTemplete;

public class RunGetEmployeeQuery extends TemplateQuery{

	@Override
	protected String runTheQuery(String query) {
		System.out.println("Run " + query);
		return "All employees get!";
	}

}
