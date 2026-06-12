public class main {
    public static void main(String a[])
    {
        int i = 0;
        int j = 0;
        int nums[] = new int[5];

        try
        {
            j = 8 / i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Problem Found: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Problem Found: "+e);
        }
        catch(Exception e){
            System.out.println("Problem Found: "+e);
        }
        System.out.println("The value of j is: "+j);
        System.out.println("Bye");
    }

}
