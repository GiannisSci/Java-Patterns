package pTemplete;

public class RunAddEmployeeQQuery extends TemplateQuery{

	@Override
	protected String runTheQuery(String query) {
		System.out.println("Run " + query);
		return "employee added";
	}

}
