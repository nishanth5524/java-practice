package gc;

public class Demo_02 {

	public static void main(String[] args) {
		
		//String s = new String("Nishanth");
		 Demo_02 s = new Demo_02();
		s=null;
		
		System.gc();
		System.out.println("End of main");
		
	}
	
	public void finalize(){
		
		System.out.println("finialize Method Called");
		
	}
	
}
