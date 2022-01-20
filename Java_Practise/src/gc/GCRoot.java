package gc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

class student {
	private int rollnum;
	private String name;

	student(int rollnum, String name) {
	this.rollnum = rollnum;
	this.name = name;
	}

}

class Local {

	void addData() throws InterruptedException {
		Vector<student> v = new Vector();
		student[] ob1 = new student[1000001];

		System.out.println("Inserting 1Million_data in main");
		for (int i = 1; i <= 1000000; i++) {
			ob1[i] = new student(i, "jack" + i);
	//		ob1[i] = new student();
			v.add(ob1[i]);
		}
		System.out.println("Done!");

	}

}

public class GCRoot {
	
	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		ArrayList<student> list = new ArrayList();
		student[] ob = new student[1000001];

		while (true) {
			System.out.println("Enter your Choice\n1-Main\n2-Local\n3-exit");
			int n = sc.nextInt();

			switch (n) {
			case 1:
				System.out.println("Inserting 1Million_data in main");

				for (int i = 1; i <= 1000000; i++) {
		    		ob[i] = new student(i, "jack" + i);
			//		ob[i] = new student();
					list.add(ob[i]);
				}
				
				System.out.println(ob[1].toString());
				System.out.println(ob[1].hashCode());
				System.out.println("Done!");
				break;

			case 2:
				Local l = new Local();
				l.addData();
				break;
			}

		}

	}

}
