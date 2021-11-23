package DemoProject;

import java.util.*;

public class ArrayListObject {


    public static void main(String args[])
    {
    
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<Employee>();
               
        Employee ob1 = new Employee(10,"hi");
        Employee ob2 = new Employee(20,"hello");
         
        list.add(ob1);
        list.add(ob2);
        
         Iterator it = list.iterator();
         
         while(it.hasNext())
         {
             Employee obj = (Employee)it.next();
             System.out.println(obj.age+" "+obj.name);
         }
         
    }
    
    
 }
