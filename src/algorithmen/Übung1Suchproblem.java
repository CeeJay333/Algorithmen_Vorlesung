package algorithmen;

public class Übung1Suchproblem {
	
	public String suche(int A[], int v){	
		int len = A.length;
		String ausgabe = "NIL";
		
		for(int i=0;i<len;i++){
			if(A[i]==v){
				ausgabe = A[i] + "";
				break;
			}
		}		
		return ausgabe;
	}
}
