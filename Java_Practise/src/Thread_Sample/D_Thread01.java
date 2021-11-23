package Thread_Sample;

class D_Thread01 extends Thread {

    private Object ob1;
    private Object ob2;

    public D_Thread01(Object ob1, Object ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    public void run() {
        synchronized (ob1) {

            System.out.println("Acquire lock on object 1 Waiting for Object 2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }

            synchronized (ob2) {
                System.out.println("Acquire lock on object 1 and Object 2");
            }

        }
    }

}
