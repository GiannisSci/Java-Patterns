package pTemplete;

public class Main {

	public static void main(String[] args) {
		RunAddEmployeeQQuery runAdd = new RunAddEmployeeQQuery();
		runAdd.templateMethod("INSERT employee into employees");
		
		new TemplateQuery()
		{
			@Override
			protected String runTheQuery(String query) {
				System.out.println("Run " + query);
				return "New DB created!";
			}
		}.templateMethod("REMOVE employees table");
		
		
		new TemplateQuery()
		{
			@Override
			protected String runTheQuery(String query) {
				System.out.println("Run " + query);
				return "New DB created!";
			}
		}.templateMethod("UPDATE employees table");
		
		
	}

}
