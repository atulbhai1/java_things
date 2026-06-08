class A{
    public void show(){
        System.out.println("in A show");
    }
}


public class main {
    public static void main(String a[])
    {
        A obj = new A()
        {
            public void show(){
                System.out.println("in nAw show");
            }
        };
        obj.show();
    }

}
