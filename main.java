class Computer {
    public void playMusic(){
        System.out.println("MOOSIC");
    }
    public String sendText(String message, long phoneNumber) {
        System.out.println("Sending Text: "+message+" to "+phoneNumber);
        return (String) ("Successfully sent message to "+ phoneNumber);
    }
}

public class main {
    public static void main(String a[]){
        long myNum = 999999999;
        Computer comp = new Computer();
        System.out.println(comp.sendText("Hi", myNum));
    }

}
