package Thread_Sample;

class info {

    int num;
    boolean flag = false;
    
    public synchronized void put(int num) {
        
        while(flag)
        try { wait(); } catch(Exception e) { }
        this.num = num;
        System.out.println("get: " + num);
        flag = true;
        notify();
    }

    public synchronized void get() {
        
         while(!flag)
        try { wait(); } catch(Exception e) { }
        System.out.println("put: " + num);
        flag = false;
    }
}

class producer implements Runnable {

    info obj;

    public producer(info obj) {
        this.obj = obj;
        Thread t1 = new Thread(this);
        t1.start();
    }

    public void run() {
        int i = 0;

        while (true) {
            obj.put(i++);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class consumer implements Runnable {

    info obj;

    public consumer(info obj) {
        this.obj = obj;
        Thread t2 = new Thread(this);
        t2.start();
    }

    public void run() {
        while (true) {
            obj.get();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class Communication {

    public static void main(String[] args) {

        info obj = new info();
        producer b1 = new producer(obj);
        consumer b2 = new consumer(obj);

    }

}
