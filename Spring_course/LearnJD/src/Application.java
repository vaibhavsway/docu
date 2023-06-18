import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;


public class Application {

	public static void main(String[] args)  {
		
		String url = "jdbc:mysql://localhost:3306/employees_database";
		try {
			Connection conn = DriverManager.getConnection(url,"root","Afcat-01-2022");
			
			Statement state= conn.createStatement();
			
			ResultSet result=state.executeQuery("Select * from employees_tbl");
			Set<String> name=new HashSet<String>();
			while(result.next()) {
				name.add(result.getString("name"));
			}
			System.out.println(name);
			
			System.out.println(state.executeQuery("Select dept from employees_tbl where name=\"Samuel\""));
			
			for(String s:name) {
				System.out.println(s +" "+state.executeQuery("Select dept from employees_tbl where name=\""+s+"\""));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
