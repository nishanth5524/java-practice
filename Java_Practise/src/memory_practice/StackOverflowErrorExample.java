package memory_practice;

public class StackOverflowErrorExample {

	  public static void recursivePrint(int num) throws InterruptedException {
	    System.out.println("Number: " + num);
	    if (num == 0)
	      return;
	    else
	    {
	    	Thread.sleep(1);
	      recursivePrint(++num);
	    }
	  }

	    public static void main(String[] args) throws InterruptedException {
	      StackOverflowErrorExample.recursivePrint(1);
	    }
	}