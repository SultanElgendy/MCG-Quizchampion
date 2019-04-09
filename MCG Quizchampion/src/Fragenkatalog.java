import java.util.ArrayList;
import java.util.HashMap;

public class Fragenkatalog {

	HashMap<String, HashMap<Integer, ArrayList<Fragen>>> fragenliste = new HashMap<String, HashMap<Integer, ArrayList<Fragen>>>();
	ArrayList<String> kategorien = new ArrayList <String>();
	
	public Fragenkatalog()
	{
			kategorienFuellen();
			for(int i = 0; i<kategorien.size();i++)
			{
				fragenliste.put(kategorien.get(i), new HashMap<Integer, ArrayList<Fragen>>());
			}
	}
	
	private void kategorienFuellen()
	{
		kategorien.add("Informatik");
		kategorien.add("Sport");
		kategorien.add("Games");
		kategorien.add("Rund um die Welt");
		kategorien.add("Mathematik");
		kategorien.add("Musik");
		kategorien.add("Im Labor");
		kategorien.add("Religion");
		kategorien.add("In der Natur");
	}
	
	
}
