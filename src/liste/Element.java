package liste;

public class Element {
	private Element vorgänger = new Element();
	private Element nachfolger = new Element();	
	private int int_w;
		
	
	public Element getVorgänger(){
		return vorgänger;
	}
	
	public Element getNachfolger(){
		return nachfolger;
	}
	
	public void setVorgänger(Element x){
		vorgänger = x;
	}
	
	public void setNachfolger(Element x){
		nachfolger = x;
	}
	
	public void setWert(int wert){		
		int_w = wert;
	}
	
	public int getWert(){
		return int_w;
	}
}
