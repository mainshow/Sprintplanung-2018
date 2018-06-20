
public class Hauptklasse {
	public static int anzahlErstellteSprints = 0;
	public static int anzahlErstellteAufgaben = 0;
	public static Sprint[] sprints = new Sprint[10];
	public static Aufgabe[] aufgaben = new Aufgabe[200];
	
	public static void main(String[] args) {
		erstelleAufgabe();
		erstelleSprint();
		aufgaben[0].gebeAufgabeAus();
		fügeAufgabeInSprint(0);
		sprints[0].gebeSprintAus(0);
		
	}
	
	private static void erstelleSprint()
	{
		if(anzahlErstellteSprints<sprints.length && sprints[anzahlErstellteSprints] == null)
		{
			sprints[anzahlErstellteSprints] = new Sprint();
			sprints[anzahlErstellteSprints].setNummer(Sprint.getNummerGesetzt());
			sprints[anzahlErstellteSprints].setZeitkontingent(Sprint.getZeitkontingentGesetzt());
			anzahlErstellteSprints++;
		}
	}
	
	private static void erstelleAufgabe()
	{
		if(anzahlErstellteAufgaben<aufgaben.length && aufgaben[anzahlErstellteAufgaben] == null)
		{
			aufgaben[anzahlErstellteAufgaben] = new Aufgabe();
		}
	}
	
	public static void fügeAufgabeInSprint(int indexAufgabe)
	{
		int k = 0;
		boolean freienPlatzgefunden = false;
		while(sprints[k].getZeitkontingent() - aufgaben[indexAufgabe].getAufwand() >= 0 && sprints[k] != null && freienPlatzgefunden == false)  
		{
			int p = 0;
			
			while(p < sprints[k].aufgabenSprint.length && freienPlatzgefunden == false)
			{
				if(sprints[k].aufgabenSprint[p] == null)
				{
					sprints[k].aufgabenSprint[p] = aufgaben[indexAufgabe];
					freienPlatzgefunden = true;
				}				
				else
				{
					p++;
				}
				
			}
			
		}
	}

}
