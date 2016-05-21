package baum;

public class Baum {
	Knoten knoten;
	
	public Baum(){
		knoten = new Knoten(18);
		knoten.knoten_links = new Knoten(12);
		knoten.knoten_links.knoten_links = new Knoten(7);
		knoten.knoten_links.knoten_rechts = new Knoten(4);
		knoten.knoten_links.knoten_rechts.knoten_links = new Knoten(5);
		knoten.knoten_rechts = new Knoten(10);
		knoten.knoten_rechts.knoten_links = new Knoten(2);
		knoten.knoten_rechts.knoten_rechts = new Knoten(21);
	}
	
	public void ausgabe(Knoten startknoten){
		if(startknoten.knotenLinksValid()){
			ausgabe(startknoten.knoten_links);
		}
		if(startknoten.knotenRechtsValid()){
			ausgabe(startknoten.knoten_rechts);
		}
		System.out.println(startknoten.schlüssel);		
	}
	
	public void ausgabe(){ 
		//funktion überladen. wird kein Parameter übergeben: Startknoten = knoten
		if(knoten.knotenLinksValid()){
			ausgabe(knoten.knoten_links);
		}
		if(knoten.knotenRechtsValid()){
			ausgabe(knoten.knoten_rechts);
		}
		System.out.println(knoten.schlüssel);
	}
}

