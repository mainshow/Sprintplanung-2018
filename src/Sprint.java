
public class Sprint {

	private static int nummer = 0;
	private Aufgabe[] aufgaben;
	private double zeitkontingent = 30;
	
	public Sprint()
	{
		this.zeitkontingent = zeitkontingent;
	}
	
	//Die Aufgaben müssen noch dem Sprint hinzugefügt werden
	
	void gebeSprintAus()
	{
		for(int i = 1; i < Aufgabe.getAnzahl(); i++)
		{
			//Hier werden die Aufgaben des Sprints ausgegeben
		}
	}
	
	public static void erstelleSprint()
	{
		nummer++;
		Sprint nummer = new Sprint();
	}
	
	public static int getNummer()
	{
		return nummer;
	}
	
	public double getZeitkontingent()
	{
		return zeitkontingent;
	}
	
	public void setZeitkontingent(double subtrahend)
	{
		zeitkontingent = zeitkontingent - subtrahend;
	}
}
