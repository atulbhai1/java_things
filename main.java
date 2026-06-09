interface A{
    void show();
    void config();
}
class B implements A{
    public void show(){
        System.out.println("B show");
    }
    public void config(){
        System.out.println("B config");
    }
}

public class main {
    public static void main(String a[])
    {
        A obj;
        obj = new B();
    }

}
