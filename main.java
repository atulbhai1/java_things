abstract class A{
    public abstract void show();
}


public class main {
    public static void main(String a[])
    {
        A obj = new A(){
            public void show(){
                System.out.println("in B show");
            }
        };
        obj.show();
    }

}
