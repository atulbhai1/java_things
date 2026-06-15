import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class main {
    public static void main(String a[]) throws IOException
    {

        //InputStreamReader in = new InputStreamReader(System.in);
        //BufferedReader bf = new BufferedReader(in);
        Scanner sc = new Scanner(System.in);
        //System.out.println(Integer.parseInt(bf.readLine()));
        System.out.println(sc.nextInt());
        //bf.close();
        sc.close();
    }

}
