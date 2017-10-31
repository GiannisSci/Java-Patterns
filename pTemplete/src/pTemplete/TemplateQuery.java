package pTemplete;

public abstract class TemplateQuery {

	protected String getDbConnection()
	{
		return "DB Connection";
	}
	
	protected String connectToDB(String conn)
	{
		return "Connected";
	}	
	
	protected String closeConnection()
	{
		return "Closed";
	}
	
	protected abstract String runTheQuery(String query);
	
	public String templateMethod(String query)
	{
		// 1
		String conn = getDbConnection();
		
		// 2
		String db = connectToDB(conn);
		
		// 3
		runTheQuery(query);
		
		// 4
		closeConnection();
		return "employee added";
	}
}
