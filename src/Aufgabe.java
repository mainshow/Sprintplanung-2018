import javax.swing.JOptionPane;
import java.lang.Object;

public class Aufgabe {
	private String name;
	private int ticketnummer =00000;
	private String datum;
	private boolean standard;
	private String status;
	private int sprint;
	private static int anzahl = 0;
	private double aufwand;
	
	public Aufgabe()
	{
		anzahl++;
	}

	public Aufgabe (String name, String datum, boolean standard, String status, double aufwand){
		this.name = name;
		this.ticketnummer = ++ticketnummer;
		this.datum = datum;
		this.standard = standard;
		this.status = status;
		this.aufwand = aufwand;
		anzahl++;
	}

	static void erstelleNeueAufgabe()
	{
		
		Aufgabe name = new Aufgabe(JOptionPane.showInputDialog("Name?"), 
				JOptionPane.showInputDialog("Datum?"),
				Boolean.parseBoolean(JOptionPane.showInputDialog("Standardaufgabe?")),
				JOptionPane.showInputDialog("Status?"),
				Double.parseDouble(JOptionPane.showInputDialog("Aufwand?")));
	}
	void gebeAufgabeAus()
	{
		System.out.println(this.ticketnummer + this.name + this.datum + this.standard + this.status + this.aufwand);
	}
	
	static int getAnzahl()
	{
		return anzahl;
	}
	
	void fügeSprintHinzu()
	{
		if(Sprint.getNummer() > 0)  
		{
			int aktuellerSprint = Sprint.getNummer();
			if (aktuellerSprint.getZeitkontingent() - aufwand) > 0.0)
			{
				
			}
		}
	}
}

