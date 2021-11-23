package Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread1 implements Runnable{

	private List<Integer> myList;
	private Object host;
	public MyThread1(List<Integer> list, Object object){
		this.myList = list;
		this.host = object;
	}
	
	private void updateList(int i){
		synchronized(this.host){
			System.out.println(this.toString());
			myList.add(i);
		}
	}
	
	@Override
	public void run() {
		for( int i = 0; i < 10;i++){
			updateList(i);
		}
		System.out.println("end: " + myList.size());
	}
	
}
public class ALMyExecutorlock {

	private ArrayList<Integer> taskList = new ArrayList<Integer>();
	private Object object = new Object();
	private void launch(){
		
        ExecutorService executorService= Executors.newFixedThreadPool(10);

        executorService.execute(new MyThread1(taskList, object));
        executorService.execute(new MyThread1(taskList, object));
        
        executorService.shutdown();
	}
	public static void main(String[] args) {
		ALMyExecutorlock test = new ALMyExecutorlock();
		test.launch();
	}
}