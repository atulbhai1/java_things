public class main {
    public static void main(String a[]){
        StringBuffer sb = new StringBuffer("hello");
        sb.append(" world");
        sb.deleteCharAt(2);
        sb.insert(2, "I");
        System.out.println(sb.substring());
    }

}
