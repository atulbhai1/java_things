public class main {
    public static void main(String a[])
    {
        Runnable obj1 =  () -> {
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
            };
        Runnable obj2 = () -> {
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
            };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }

}
