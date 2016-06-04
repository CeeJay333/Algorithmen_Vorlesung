package algorithmen;

public class Countingsort {
	int A[],B[],C[];
	
	public Countingsort(int[] array){
		A = array;
		B = new int[A.length];
	}
	
	public int[] getSortedArray(){
		return B;
	}
	
	public void countingsort(){
		C = new int[getMaxValue()+1];
		/*for(int i=0;i<C.length;i++){	//Initialisiere C mit 0
			C[i]=0;
		}*/
		zaehleElementeInC();
		kumuliereWert();
		sortiereElementeNachB();
	}
	
	private void kumuliereWert(){
		int wert =0;
		for (int i=0;i<C.length;i++){
			wert = wert + C[i];
			C[i] = wert;
		}
	}
	
	private void sortiereElementeNachB(){
		for(int i=A.length-1;i>0;i--){
			//Fehler
			B[C[A[i]]-1] = A[i];
			C[A[i]]--;
		}
	}
	
	private void zaehleElementeInC(){
		for(int i=0;i<A.length;i++){	//Durchlaufe ursprungsarray und zähle Elemente
			C[A[i]]++;					//Addiere 1 zur Anzahl des gefundenen Wertes hinzu
		}		
	}
	
	private int getMaxValue(){
		int max = 0;
		for(int i=0;i<A.length;i++){
			if(A[i] > max){
				max = A[i];
			}
		}
		return max;
	}
}
