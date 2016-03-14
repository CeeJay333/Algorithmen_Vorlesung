package algorithmen;

public class InsertionSort {

	public long sortASC(int A[], int n){
		Funktionen f = new Funktionen();
		f.setZeitStart();
		int key, i;
		
		for(int j=1;j<n;j++){			//Beim zweiten Element anfangen
			key = A[j];					//Wert des zweiten Elements in Zwischenvariable speichern
			i = j - 1;					//i auf das vorherige Element setzen
			while(i>-1 && A[i]>key){	//Wenn i noch nicht links rausgelaufen und der Wert von i gr��er als der gefundene Wert ist
				A[i+1] = A[i];			//Wert von i+1 auf Wert von i setzen (Aufr�cken nach rechts)
				i=i-1;					//Dann das Element davor pr�fen
			}
			A[i+1] = key;				//Alle Werte sind aufger�ckt --> Jetzt in die L�cke den neuen Wert einf�gen		
		}		
		f.setZeitStop();		
		return f.getZeitUnterschied();
	}
	
	public long sortDESC(int A[], int n){
		Funktionen f = new Funktionen();
		f.setZeitStart();
		int key, i;
		
		for(int j=1;j<n;j++){			//Beim zweiten Element anfangen
			key = A[j];					//Wert des zweiten Elements in Zwischenvariable speichern
			i = j - 1;					//i auf das vorherige Element setzen
			while(i>-1 && A[i]<key){	//Wenn i noch nicht links rausgelaufen und der Wert von i gr��er als der gefundene Wert ist
				A[i+1] = A[i];			//Wert von i+1 auf Wert von i setzen (Aufr�cken nach rechts)
				i=i-1;					//Dann das Element davor pr�fen
			}
			A[i+1] = key;				//Alle Werte sind aufger�ckt --> Jetzt in die L�cke den neuen Wert einf�gen		
		}
		f.setZeitStop();
		return f.getZeitUnterschied();
	}
}
