package baum;

public class Knoten {
	public int schlüssel;
	public Knoten knoten_links, knoten_rechts;
	
	public Knoten(int wert){
		schlüssel = wert;
	}
	
	public boolean knotenLinksValid(){
		try{
			if(knoten_links.schlüssel == 1){				
			}
			return true;
		}catch(Exception e){
			//Prüfen fehlgeschlagen. Knoten ist invalid
		}
		return false;		
	}
	
	public boolean knotenRechtsValid(){
		try{
			if(knoten_rechts.schlüssel == 1){				
			}
			return true;
		}catch(Exception e){			
		}
		return false;		
	}
	
	
	
	
}

