import javax.swing.JOptionPane;

public class Aufgabe {
	private String name;
	private int ticketnummer =00000;
	private String datum;
	private boolean standard;
	private String status;
	private int sprint;
	private static int anzahl = 0;
	
	public Aufgabe()
	{
		anzahl++;
	}

	public Aufgabe (String name, String datum, boolean standard, String status){
		this.name = name;
		this.ticketnummer = ++ticketnummer;
		this.datum = datum;
		this.standard = standard;
		this.status = status;
		anzahl++;
	}

	static void erstelleNeueAufgabe()
	{
		
		Aufgabe name = new Aufgabe(JOptionPane.showInputDialog("Name?"), 
				JOptionPane.showInputDialog("Datum?"),
				Boolean.parseBoolean(JOptionPane.showInputDialog("Standardaufgabe?")),
				JOptionPane.showInputDialog("Status?"));
	}
	void gebeAufgabeAus()
	{
		System.out.println(this.ticketnummer + this.name + this.datum + this.standard + this.status);
	}
	
	static int getAnzahl()
	{
		return anzahl;
	}
}

