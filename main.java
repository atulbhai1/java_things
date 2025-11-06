class Human {

    int age;
    String name;

    private String first_pets_name = "bill";

    public String whats_my_first_pets_name(String source){
        if (source=="Bank"||source=="Institution"){
            return first_pets_name;
        } else {
            return "NO!!!";
        }
    }

}

public class main {
    public static void main(String a[])
    {

        Human obj = new Human();
        obj.age = 15;
        obj.name = "Atul";
        //obj.first_pets_name = "h;
        System.out.println(obj.whats_my_first_pets_name("dog"));


    }

}
