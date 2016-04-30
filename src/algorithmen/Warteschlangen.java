package algorithmen;

public class Warteschlangen {
	private int kopf = 0;
	private int ende = 0;
	
	
	public void enqueue(int array[], int wert){
		//Fügt ein neues Element ans Ende der Schlange ein		
		if(pruefeArrayVoll(array) == false){
			//Array ist leer, Wert kann eingefügt werden
			array[ende] = wert;
			ende = bewegeZeiger(array,ende);
		}else{
			//Array ist voll. Überlauf!
			
		}	
	}
	
	public int dequeue(int array[]){
		//Entfernt Element am Kopf der Schlange 
		if(pruefeEnde() == false){
			//Warteschlange ist nicht leer
			int ausgabe = array[kopf];
			kopf = bewegeZeiger(array,kopf);
			return ausgabe;
		}else{
			//Array ist leer. Unterlauf!
			return 0;
		}
		
	}
	
	private boolean pruefeArrayVoll(int array[]){
		if(ende+1 == kopf){
			return true;
		}else if(ende == array.length && kopf == 0){
			return true;
		}else{
			return false;
		}
	}
	
	private int bewegeZeiger(int array[], int zeiger){
		//Prüfe ob der Index des Zeigers am Ende des Arrays angekommen ist. Falls Ja, Zeiger an den Anfang setzen.
		if(zeiger == array.length){
			return 0;
		}else{
			zeiger = zeiger +1;
			return zeiger;
		}
	}
	
	private boolean pruefeEnde(){
		if (kopf == ende){
			return true;
		}else{
			return false;
		}
	}
}
