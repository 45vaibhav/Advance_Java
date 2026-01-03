
import java.sql.*;
class Demo{
	public static void main(String args[]){
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Drived Loaded ");
		
		String url="jdbc:mysql://localhost:3306/hostel";
		String user="root";	
		String password="Vaibhav@123";

		Connection connection=DriverManager.getConnection(url , user , password);
		System.out.println("database connect sucesfully ");

		Statement stm = connection.createStatement();
			stm.executeUpdate("insert into boys " + " values(111, 'sujit', 'e&tc','vadgaon',0, 'surya', 70, 'single');");
			System.out.println("data added");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}