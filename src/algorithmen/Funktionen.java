package algorithmen;

import java.util.Random;

public class Funktionen {
	private long start, stop;
	
	public void printArray(int val[]){
		for(int i=0;i<val.length;i++){
			System.out.print(val[i] + " ");
		}
		System.out.println("");
	}
	
	public void printArray(char val[]){
		for(int i=0;i<val.length;i++){
			System.out.print(val[i] + " ");
		}
		System.out.println("");
	}
	
	public int[] generateRandomArray(int length, int uBound){
		Random rand = new Random();
		int x[] = new int[length];
		for(int i=0;i<length;i++){
			x[i] = rand.nextInt(uBound);
		}
		return x;
	}
	
	public int[] generateArray(boolean asc, int length){
		int x[] = new int[length];
		if(asc == false){
			int index = 0;
			for(int i=length-1;i>=0;i--){
				x[index] = i;
				index++;
			}
		}else{
			for(int i=0;i<length;i++){
				x[i] = i;
			}
		}		
		return x;
	}
	
	public void setZeitStart(){
		long zeit = System.currentTimeMillis();
		start = zeit;
	}
	
	public void setZeitStop(){
		long zeit = System.currentTimeMillis();
		stop = zeit;
	}
	
	public long getZeitUnterschied(){
		long unterschied;
		try{
			unterschied = stop-start;
		}catch(Exception e){
			unterschied = 0;
		}		
		return unterschied;		
	}
}
