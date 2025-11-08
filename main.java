class Human {

    int age;
    String name;
    public Human(){
        age = 12;
        name = "bob";
    }
    public Human(int a, String n){
        age = a;
        name = n;
    }

    public void display(){
        System.out.println(age+":"+name);
    }

}

public class main {
    public static void main(String a[])
    {

        Human obj = new Human();
        Human obj2 = new Human(18, "atul");
        obj.display();
        obj2.display();

    }

}
