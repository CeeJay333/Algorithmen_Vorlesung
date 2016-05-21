package algorithmen;

public class Main {

	public static void main(String[] args) {
		Funktionen f = new Funktionen();
		int a[] = f.generateRandomArray(10, 100);
		Heapsort h = new Heapsort();
		f.printArray(h.heapsortDesc(a));
//		System.out.println("Dauer: " + m.sortDesc(a, 0, a.length));		
		
	}
	
	/*
	public static void archiv(){
	
		---------------------------------------------
		//Warteschlagen
		Warteschlangen w = new Warteschlangen();
		int b[] = new int[25];
		w.enqueue(b, 7);
		w.enqueue(b, 9);
		w.enqueue(b, 166);
		w.enqueue(b, 99);
		System.out.println(w.dequeue(b));
		
	
		//Vorlesung 3+4
		//MergeSort
		MergeSort m = new MergeSort();		
		int a[] = f.generateRandomArray(100, 100);
		System.out.println("Dauer: " + m.sortAsc(a, 0, a.length));	
		
		
		----------------------------------------------
		//Vorlesung 2
		//InsertionSort
		InsertionSort sort = new InsertionSort();		
		int a[] = f.generateRandomArray(100, 100);
		sort.sortASC(a, a.length);
		
		//�bung1Suchproblem suche = new �bung1Suchproblem();		
		//int x[] = {31,29,59,26,41,58};
		//System.out.println(suche.suche(a, 42));
		
		-------------------------------
		//Vorlesung 1
		//Kleinster gemeinsamer Teiler
		KGT kgt = new KGT();
		kgt.gcd_skript(84, 231);			
		System.out.println("\nJetzt mit modulo");
		kgt.gcd_modulo(84, 231);
		
	}*/
}
