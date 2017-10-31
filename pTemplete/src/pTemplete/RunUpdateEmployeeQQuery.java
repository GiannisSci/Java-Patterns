package pTemplete;

public class RunUpdateEmployeeQQuery extends TemplateQuery{

	@Override
	protected String runTheQuery(String query) {
		System.out.println("Run " + query);
		return "employee updated";
	}

}

