import java.util.HashMap;
import java.util.Map;



public class main {
    public static void main(String a[]) {
        Map<String, Integer> Students = new HashMap<String, Integer>();
        Students.put("Navin", 56);
        Students.put("Harsh", 23);
        Students.put("Sushil", 67);
        Students.put("Kiran", 92);
        for (String student: Students.keySet()) {
            if (Students.get(student) < 70){
                System.out.println(student+" has failed.");
            }
        }
    }

}
