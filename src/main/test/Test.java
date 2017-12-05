package test;

public class Test {
	
	private int color; 

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getRouge(){
		return color>>(2*8);
	}
	
	public int getVert(){
		return color & 255<<8;
		
	}
	
	public int getBleu(){
		return color & 255;
	}
	
	public void setRouge(int rouge){
		color=color-((color>>2*8)<<2*8)+rouge<<2*8;
	}
	
	public void setVert(int vert){
		//color=color-((color>>8)<<8)+rouge<<2*8;
	}
	
	public void setBleu(int bleu){
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test= new Test();
		test.setColor(255<<8);
		test.setRouge(154);
		System.out.println(test.getRouge());

	}

}
