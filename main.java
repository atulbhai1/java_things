class Calculator {
    int c = 54;
    public int add(int a, int b){
        return (a+b);
    }
    public int sub(int a, int b){
        return (a-b);
    }
    public int absolute_sub(int a, int b){
        if (a>b) {
            return (a-b);
        }
        else {
            return (b-a);
        }
    }
}

public class main {
    public static void main(String a[]){

        Calculator calc = new Calculator();

        int result = calc.absolute_sub(2, 3);
        System.out.println(result);

    }
}
