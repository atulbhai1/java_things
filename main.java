class Mobile {
    String brand;
    int price;
    String network;
    static String name;
    static {
        name = "Phone";
        System.out.println("In STATIC");
    }
    public Mobile(){
        brand = "";
        price = 200;
    }
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }

}

public class main {
    public static void main(String a[]) throws ClassNotFoundException
    {
        //Mobile mobile1 = new Mobile();
        //mobile1.brand = "Apple";
        //mobile1.price = 1500;
        //mobile1.name = "SmartPhone";

        //Mobile mobile2 = new Mobile();

        //mobile1.show();
        //mobile2.show();
        Class.forName("Mobile");


    }

}
