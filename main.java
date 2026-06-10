enum Status{
    Running, Failed, Pending, Success;
}
public class main {
    public static void main(String a[])
    {
        Status s = Status.Pending;

        switch(s){
            case Running:
                System.out.println("Running");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            case Pending:
                System.out.println("Pending");
                break;
            default:
                System.out.println("Unknown");
                break;
        }

        if (s==Status.Running){
            System.out.println("All good");
        }
        else if (s==Status.Failed){
            System.out.println("Try Again");
        }
        else if (s==Status.Pending){
            System.out.println("Please wait");
        }
        else {
            System.out.println("Done");
        }
    }

}
