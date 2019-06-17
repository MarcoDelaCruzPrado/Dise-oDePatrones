package TFinalPatrones.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

	public static final String SQL = "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=demodb;integratedSecurity=true";
	public static final String PostgreSQL = "";
	public static final String MYSQL = "";

	private Connection con;
	
	public Connection connectDB(String db) {
		try {
			switch(db)
			{
			case "SQL":
				Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
				con = DriverManager.getConnection(SQL);
				break;
			case "MYSQL":
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(MYSQL);
				break;
			case "PostgreSQL":
				Class.forName("org.postgresql.Driver");
				con = DriverManager.getConnection(PostgreSQL);
				break;
			default:
				System.out.println("No se selecciono ninguna base de datos");
				break;
			}
		}
		catch(SQLException | ClassNotFoundException e) 
		{
			System.out.println("error connection db: " + e.getMessage());
		}
		return con;
	}
	
	public void disconnectDB() {
		try {
			con.close();
		}
		catch(Exception e) 
		{
			System.out.println("Problemas al desconectar la base de datos");
		}
	}
	
	
}
