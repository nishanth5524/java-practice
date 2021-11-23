package oops;

public class Student_main {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		long beforeUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		Student_info obj = new Student_info("Ram", 4);
		Student_info obj1 = new Student_info("Raj", 5);
		Student_info obj2 = new Student_info("Ranga", 6);

//		for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
//		    System.out.println(ste);
//		}
//		

		long end = System.currentTimeMillis();
		long afterUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		long actualMemUsed = afterUsedMem - beforeUsedMem;

		System.out.println(end - start + " Milliseconds");
		System.out.println(actualMemUsed + "bytes");

	}

}
