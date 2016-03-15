package algorithmen;

public class MergeSort {
	public long sortAsc(int A[], int p, int r){
		Funktionen f = new Funktionen();
		f.printArray(A);
		f.setZeitStart();
		A = mergeSort(A);
		//mergeSort(A,p,r);
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
	/*
	private int[] mergeSort(int A[],int p, int r){
		int q;
		if(p<r){
			q = (p+r)/2;
			mergeSort(A,p,q);
			mergeSort(A,q+1,r);
			A = merge(A,p,q,r);
		}
		return A;
	}
	
	private int[] merge(int A[], int p, int q, int r){
		int n1, n2;
		n1 = q-p+1;
		n2 = r-q;
		int L[],R[];
		L = new int[n1+1];
		R = new int[n2+1];
		
		for(int i=0;i<n1;i++){	//Elemente aus A nach L kopieren
			L[i] = A[p+i-1];
		}
		for(int j=0;j<n2;j++){	//Elemente aus A nach R kopieren
			R[j] = A[q+j];
		}
		L[n1+1] = (int) Double.POSITIVE_INFINITY;
		R[n2+1] = (int) Double.POSITIVE_INFINITY;
		int i=1;
		int j=1;
		
		//Merge
		for (int k=p;k<r;k++){
			if(L[i]<=R[j]){
				A[k] = L[i];
				i++;
			}else{
				A[k] = R[j];
				j=j+1;
			}
		}
		return A;
	}*/
}
