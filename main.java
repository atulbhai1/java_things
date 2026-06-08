class A{
    int age;

    public void show(){
        System.out.println("Showing");
    }

    static class B{
        public void config(){
            System.out.println("in config");
        }
    }
}


public class main {
    public static void main(String a[])
    {
        A obj=new A();
        obj.show();
        A.B b = new A.B();
        b.config();
    }

}
