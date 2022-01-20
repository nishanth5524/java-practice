package memory_practice;

public class JavaGetStackTraceExp   
{  
    public static void main(String args[])   
    {  
    first();  
    }   
    public static void first()  
    {  
        second();  
    }  
    public static void second()   
    {  
        third();  
    }  
    public static void third()   
    {  
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();  
        System.out.println("Displaying Stack trace using StackTraceElement in Java");  
        for(StackTraceElement st : stackTrace)  
        {  
            // print the stack trace   
            System.out.println(st);  
        }  
    }
}
