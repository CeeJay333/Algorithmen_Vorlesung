package algorithmen;

public class KGT {
	//Berechnet den kleinsten gemeinsamen Teiler	
	public int gcd_skript(int u, int v){
		int tmp;		
		while(u>0){
			System.out.println("Neuer Durchlauf: u=" + u + ", v=" +v);
			if(u<v){	
				System.out.println("u kleiner v");
				tmp = u;
				u = v;
				v = tmp;
			}			
			u = u - v;
						
			System.out.println("u=" + u + ", v=" +v);			
		}
		System.out.println("Ausgabe: " + v);
		return v;
	}
	
	public int gcd_modulo(int u, int v){
		int tmp;		
		while(u>0){
			System.out.println("Neuer Durchlauf: u=" + u + ", v=" +v);
			if(u<v){	
				System.out.println("u kleiner v");
				tmp = u;
				u = v;
				v = tmp;
			}
			if (u%v==0){ //auch mit modulo möglich. dann ist v bereits durch u teilbar
				break;
			}else{
				u = u % v;
			}				
			System.out.println("u=" + u + ", v=" +v);			
		}
		System.out.println("Ausgabe: " + v);
		return v;
	}
}
