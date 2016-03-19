package algorithmen;

public class MergeSort {	
	public long sortDesc(int A[], int p, int r){
		Funktionen f = new Funktionen();
		f.printArray(A);
		f.setZeitStart();
		
		A = mergeSortDesc(A);
		
		f.setZeitStop();
		f.printArray(A);
		return f.getZeitUnterschied();
	}
	private int[] mergeSortDesc(int A[]){
		int len = A.length;
		if(len <=1){
			return A;
		}else{			
			int q = len / 2;
			int L[], R[];
			L = new int[q];
			R = new int[len-q];
			for(int i=0;i<q;i++){
				L[i] = A[i];
			}
			for(int i=q;i<len;i++){
				R[i-q]= A[i];
			}
			L = mergeSortDesc(L);
			R = mergeSortDesc(R);
			return mergeDesc(L,R);
		}
	}
	private int[] mergeDesc(int L[], int R[]){
		int B[], il,ir,ib;
		B = new int[L.length+R.length];
		il = 0;
		ir = 0;
		ib = 0;
		while(il<L.length && ir<R.length){
			if(L[il]>R[ir]){
				B[ib] = L[il];
				il++;
				ib++;
			}else{
				B[ib] = R[ir];
				ir++;
				ib++;
			}
		}
		while(il<L.length){
			B[ib] = L[il];
			ib++;
			il++;
		}
		while(ir<R.length){
			B[ib] = R[ir];
			ir++;
			ib++;
		}		
		return B;
	}
	
	public long sortAsc(int A[], int p, int r){		
		Funktionen f = new Funktionen();
		f.printArray(A);
		f.setZeitStart();
		
		A = mergeSort(A);
		
		f.setZeitStop();
		f.printArray(A);
		return f.getZeitUnterschied();
	}
	
	private int[] mergeSort(int A[]){
		int len = A.length;
		if(len <=1){
			return A;
		}else{			
			int q = len / 2;
			int L[], R[];
			L = new int[q];
			R = new int[len-q];
			for(int i=0;i<q;i++){
				L[i] = A[i];
			}
			for(int i=q;i<len;i++){
				R[i-q]= A[i];
			}
			L = mergeSort(L);
			R = mergeSort(R);
			return merge(L,R);
		}
	}
	
	private int[] merge(int L[], int R[]){
		int B[], il,ir,ib;
		B = new int[L.length+R.length];
		il = 0;
		ir = 0;
		ib = 0;
		while(il<L.length && ir<R.length){
			if(L[il]<R[ir]){
				B[ib] = L[il];
				il++;
				ib++;
			}else{
				B[ib] = R[ir];
				ir++;
				ib++;
			}
		}
		while(il<L.length){
			B[ib] = L[il];
			ib++;
			il++;
		}
		while(ir<R.length){
			B[ib] = R[ir];
			ir++;
			ib++;
		}		
		return B;
	}
		
}
