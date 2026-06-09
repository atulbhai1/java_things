enum Status{
    Running, Failed, Pending, Success;
}
public class main {
    public static void main(String a[])
    {
        Status s = Status.Running;
        s.ordinal();
        Status[] values = Status.values();
    }

}
