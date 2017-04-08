import java.sql.*;

public class DemoDB {

	public static void main(String[] args) {
		try
		{
			//step1 create connection
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			//step2 create statement
			Statement stm=con.createStatement();
			//step3 execute SQL query
			ResultSet rs=stm.executeQuery("select * from stud");
			//step4 process the resultset
			while(rs.next())
			{
				System.out.println(rs.getString("name")+","+rs.getString("city"));
			}
			
		}
		catch(Exception ex)
		{
			
		}

	}

}
