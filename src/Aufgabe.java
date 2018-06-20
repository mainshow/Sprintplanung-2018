import javax.swing.JOptionPane;
import java.lang.Object;

public class Aufgabe {
	private String name;
	private int ticketnummer =00000;
	private String datum;
	private Boolean standard;
	private String status;
	private int sprint;
	private static int anzahl = 0;
	private double aufwand;


	public Aufgabe(){
		this.name = JOptionPane.showInputDialog("Name?");
		this.ticketnummer = ++ticketnummer;
		this.datum = JOptionPane.showInputDialog("Datum?");
		this.standard = Boolean.parseBoolean(JOptionPane.showInputDialog("Standardaufgabe?"));
		this.status = JOptionPane.showInputDialog("Status?");
		this.aufwand = Double.parseDouble(JOptionPane.showInputDialog("Aufwand?"));
		anzahl++;
	}
	
	void gebeAufgabeAus()
	{
		System.out.println(this.ticketnummer + this.name + this.datum + this.standard + this.status + this.aufwand);
	}
	
	static int getAnzahl()
	{
		return anzahl;
	}
	
	public double getAufwand()
	{
		return aufwand;
	}

	public String getName() {
		return name;
	}
	
	
}

