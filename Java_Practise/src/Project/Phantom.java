package Project;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

class Demo3
{
	void show()
	{
		System.out.println("Phantom");
	}
}

public class Phantom {

	public static void main(String[] args)
    {
        //Strong Reference
        Demo3 g = new Demo3();     
        g.show();
          
        //Creating reference queue
        ReferenceQueue<Demo3> refQueue = new ReferenceQueue<Demo3>();
  
        //Creating Phantom Reference to Demo2-type object to which 'g' 
        //is also pointing.
        PhantomReference<Demo3> phantomRef = null;
          
        phantomRef = new PhantomReference<Demo3>(g,refQueue);
          
        //Now, Demo2-type object to which 'g' was pointing
        //earlier is available for garbage collection.
        //But, this object is kept in 'refQueue' before 
        //removing it from the memory.
        g = null; 
          
        //It always returns null. 
        g = phantomRef.get(); 
          
        //It shows NullPointerException.
        g.show();
    }
}
