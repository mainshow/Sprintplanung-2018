
public class Sprint {

	private static int nummerGesetzt = 1;
	private static double zeitkontingentGesetzt = 30;
	private int nummer;
	private double zeitkontingent;
	public Aufgabe[] aufgabenSprint = new Aufgabe[100];
	
	public Sprint()
	{		
		nummer = nummerGesetzt;
		nummer++;
	}
	
	//Die Aufgaben müssen noch dem Sprint hinzugefügt werden
	
	public void gebeSprintAus(int sprint)
	{
		
			if(aufgabenSprint[sprint] != null)
			System.out.println(aufgabenSprint[sprint].getName());
			else
				System.out.println("Keine Daten");
		
	}
	
	public static int getNummerGesetzt()
	{
		return nummerGesetzt;
	}
	
	public static double getZeitkontingentGesetzt()
	{
		return zeitkontingentGesetzt;
	}
	
	public void setZeitkontingentGesetzt(double subtrahend)
	{
		zeitkontingent = zeitkontingent - subtrahend;
	}
	
	public void setZeitkontingent(double zeitkontingentGesetzt)
	{
		zeitkontingent = zeitkontingentGesetzt;
	}
	
	public int getNummer()
	{
		return nummer;
	}
	
	public void setNummer(int nummerGesetzt)
	{
		nummer = nummerGesetzt;
	}
	
	public double getZeitkontingent()
	{
		return zeitkontingent;
	}
}
