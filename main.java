class Mobile {
    String brand;
    int price;
    String network;
    static String name;
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
}

public class main {
    public static void main(String a[]){
        Mobile mobile1 = new Mobile();
        mobile1.brand = "Apple";
        mobile1.price = 1500;
        mobile1.name = "SmartPhone";

        Mobile mobile2 = new Mobile();
        mobile2.brand = "Samsung";
        mobile2.price = 1700;
        mobile2.name = "Phone";

        Mobile.name = "Smart Phone";
        mobile1.show();
        mobile2.show();
        System.out.println(Mobile.name);
    }

}
