import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 
import java.util.Date;

public class Datenbankverbindung {

	
	private static Connection conn = null;
	
	//Hostname
	private static String dbHost = "localhost";
	
	//Port -- Standard: 3306
	private static String dbPort = "3306";
	
	//Datenbankname
	private static String database = "sprintplanung";
	
	//Datenbankuser
	private static String dbUser ="sqluser";
	
	//Datenbankpasswort
	private static String dbPassword = "sqluserpw";
	
	private Datenbankverbindung() {
		try {
			
			//Datenbanktreiber für ODBC Schniottstelle laden.
			//Für verschiedene ODBC-Datenbanken muss dieser Treiber nur einmal geladen werden
			Class.forName("com.mysql.jdbc.Driver");
			
			//Verbindung zur ODBC-Datenbank 'sprintplanung' herstellen.
			//Es wird die JDBC-ODBC-Brücke verwendet.
			conn = DriverManager.getConnection("jdbc:mysql://" + dbHost + ":" + dbPort +  "/" + database + "?"+ "user=" + dbUser + "&" + "password=" + dbPassword);
		} catch (ClassNotFoundException  e) {
			System.out.println("Treiber nicht gefunden");
		} catch (SQLException e) {
			System.out.println("Connect nicht möglich");
		}
	}
	
	private static Connection getInstance() {
		if(conn == null)
			new Datenbankverbindung();
		return conn;
	}
	
	public static void erzeugeAufgabenListe() {
		conn = getInstance();
		
		if(conn != null)
		{
			//Anfrage-Statement erzeugen.
			Statement anfrage;
			try {
				anfrage = conn.createStatement();
				
				//Ergebnistabelle erzeugen und abholen
				String sql = "SELECT * FROM aufgabe " + "ORDER BY id";
				ResultSet resultat = anfrage.executeQuery(sql);
				
				//Ergebnissätze durchfahren
				while (resultat.next()) {
					int id = resultat.getInt("id");
					String bezeichnung = resultat.getString("bezeichnung");
					Date datum = resultat.getDate("anlagedatum");
					boolean standardAufgabe  = resultat.getBoolean("standardaufgabe");
					String aktuellerStatus = resultat.getString("aktuellerstatus");
					int geschaetzterAufwand = resultat.getInt("geschaetzterAufwand");
					int realeraufwand = resultat.getInt("realeraufwand");
					String kommentar = resultat.getString("kommentar");
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		
		}	
	}
}
