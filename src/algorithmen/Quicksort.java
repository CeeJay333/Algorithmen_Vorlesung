package algorithmen;

public class Quicksort {
	int[] A;
	
	public Quicksort(int[] array){
		//Das Array wird in A gespeichert. Im Vorlesungsskript wird es mit jedem Prozeduraufruf schreibend übergeben
		A = array;
	}
	
	public int[] getArray(){
		return A;
	}
	
	public void quicksort(int p, int r){
		/*p ist das erste Element
		 * r ist das letzte Element
		 */
		int q;
		if(p<r){	//solange etwas sortiert werden soll
			q = partition(p,r);		//gibt das Element das korrekt steht wieder (pivotelement)
			quicksort(p,q-1);		//linke Seite
			quicksort(q+1,r);		//rechte Seite
		}
	}
	
	
	private int partition(int p, int r){
		//A ist das Array
		//p ist das erste Element
		//r ist das letzte Element
		int x = A[r];					//x ist der Wert des Pivotelementes
		int i = p-1;					//i ist Trennindex
		for(int j=p;j<=r-1;j++){		//durchlaufe das Feld bis zum Pivotelement
			if(A[j]<=x){				//ist der Wert kleiner als der Pivotwert
				i=i+1;					//Trennindex um 1 erhöhen
				tausche(i,j);			//Elemente Tauschen
			}
		}
		tausche(i+1,r);				//Am Ende setze das Pivotelement zwischen das kleine und das große Feld
		return i+1;					//Rückgabe des indexes des Pivotelementes
	}
	
	private void tausche(int a, int b){
		int x = A[a];
		A[a] = A[b];
		A[b] = x;
	}

}
