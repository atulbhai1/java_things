public class main {
    public static void main(String a[]){

        for(int b=1;b<=7;b++)
        {
            for(int h=0;h<=23;h++) {
                int hour = 0;
                if (h>12){
                    hour = h%12;
                }
                else{
                    hour = h;
                }
                System.out.println("Day:"+ b);
                System.out.println("Hour:"+ hour);
                System.out.println();
            }
        }




    }
}
