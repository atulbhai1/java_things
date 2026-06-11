class A {
    public void showTheDataBelongingToThisClass(){
        System.out.println("Hello World");
 }
}

class B extends A{
    @Override
    public void showTheDataBelongingToThisClass(){
        System.out.println("Hello World2");
    }
}

public class main {
    public static void main(String a[])
    {
        B i = new B();
        i.showTheDataBelongingToThisClass();

    }

}
