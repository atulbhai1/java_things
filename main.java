import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String a[]) throws IOException
    {
        int num = 0;
        //BufferedReader br = null;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));)
        {
            //br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
        }

    }

}
