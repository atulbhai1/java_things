class A extends Thread{
    public void run(){
        for (int i=1;i<=10;i++)
        {
        System.out.println("hi");
        try {
            Thread.sleep(5);
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i=1;i<=10;i++)
        {
            System.out.println("hello");
            try {
                Thread.sleep(5);
            }
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

public class main {
    public static void main(String a[])
    {
        A obj1 =  new A();
        B obj2 = new B();
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        try {
            Thread.sleep(2);
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        obj2.start();
    }

}
