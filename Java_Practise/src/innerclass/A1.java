package innerclass;

public class A1 {

    public static void main(String args[]) {
        phone obj = new phone() {
            public void show() {
                super.show();
                System.out.println("hello");
            }
        };
        obj.show();
    }

}

class phone {

    public void show() {
        System.out.println("hi");
    }
}
