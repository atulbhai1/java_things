abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing music");
    }

}

class WagonR extends Car{
    public void drive(){
        System.out.println("Driving WagonR");
    }
}
public class main {
    public static void main(String a[])
    {
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();

    }

}
