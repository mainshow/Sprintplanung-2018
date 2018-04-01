
public class Sprint {

	private String name;
	private int nummer;
	private Aufgabe[] aufgaben;
	
	public Sprint(String name, int nummer, Aufgabe[] aufgaben)
	{
		this.name = name;
		this.nummer = nummer;
		this.aufgaben = aufgaben;
	}
	
	//Die Aufgaben müssen noch dem Sprint hinzugefügt werden
	
	void gebeSprintAus()
	{
		for(int i = 1; i < Aufgabe.getAnzahl(); i++)
		{
			//Hier werden die Aufgaben des Sprints ausgegeben
		}
	}
}
