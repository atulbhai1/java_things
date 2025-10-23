class Computer {
    public void playMusic(){
        System.out.println("MOOSIC");
    }
    public String sendText(String message, long phoneNumber) {
        System.out.println("Sending Text: "+message+" to "+phoneNumber);
        return (String) ("Successfully sent message to "+ phoneNumber);
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public int add(int n1, int n2){
        return n1+n2;
    }
}

public class main {
    public static void main(String a[]){
        Computer comp = new Computer();
        int r1 = comp.add(2, 3, 4);
        System.out.println(r1);
    }

}
