package algorithmen;

public class Heapsort {		
	int array[];
	public int heapsortDesc(int a[])[]{
		array = a;
		int n = a.length-1;
		build_max_heap(n);
		for(int i=n;i>1;i--){
			tausche(1,i);
			max_heapify(1,i-1);
		}
		return array;
	}
	
	private int getLinkesKind(int index){
		return index*2;
	}
	
	private int getRechtesKind(int index){
		return (index*2)+1;
	}
	
	private void build_max_heap( int length){
		System.out.println("Max Heap ermitteln");
		for(int i=length/2;i>=0;i--){
			max_heapify(i, length);
		}
		
	}
	
	
	private void max_heapify(int index, int length){
		//Repariert den Baum. Setzt den größten Wert an die Spitze, alle Kinder sind gleich oder kleiner		
		int largest;
		
		//prüfen ob das linke Kind größer als aktueller Wert
		if (getLinkesKind(index)<=length && array[getLinkesKind(index)]>array[index]){
			largest = getLinkesKind(index);
		}else{
			largest = index;
		}
		
		//prüfen ob das rechte Kind größer als das bis jetzt größte (um auch das größte Kind zu ermitteln)
		if (getRechtesKind(index)<=length && array[getRechtesKind(index)]>array[index]){
			largest = getRechtesKind(index);
		}else{
			largest = index;
		}
		//ist das linke oder das rechte Kind größer als der aktuelle Wert, 
		//tauschen und für das Kind funktion erneut ausführen		
		if(largest != index){
			tausche(index,largest);
			max_heapify(largest,length);
		}
	}
	
	private void tausche(int a, int b){
		int x = array[a];
		array[a] = array[b];
		array[b] = x;
	}
	
	

}
