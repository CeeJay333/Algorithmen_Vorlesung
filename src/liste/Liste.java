package liste;

public class Liste {
	Element wächter;
	
	public Liste(){
		//Wächter erstellen
		wächter = new Element();
		wächter.setVorgänger(wächter);
		wächter.setNachfolger(wächter);
	}
	
	public void addElement(int wert){
		//Fügt ein Element an die erste Position ein
		Element neu = new Element();
		neu.setWert(wert);
		neu.setVorgänger(wächter);
		neu.setNachfolger(wächter.getNachfolger());
		wächter.setNachfolger(neu);
	}
	
	public void dropElement(int wert){
		//Löcht das erste Element mit dem angegebenen wert
		
	}
}
