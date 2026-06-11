@FunctionalInterface
interface A{
    int add(int b, int c);
}


public class main {
    public static void main(String a[])
    {
        A obj = (b, c) -> b+c;

    }

}
