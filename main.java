enum Laptop{
    Macbook(2000), XPS(2200), Surface, Thinkpad(1800);

    public int getPrice() {
        return price;
    }

    private int price;

    private Laptop() {
        this.price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }
}
public class main {
    public static void main(String a[])
    {

        for (Laptop lap: Laptop.values()){

        System.out.println("Laptop: " + lap + "----" + "Price: "+lap.getPrice());}

    }

}
