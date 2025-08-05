public class main {
    public static void main(String[] args){

        String day = "Satundy";

        day = switch(day) {
            case "Monday" -> "Sunday";

            case "Saturday", "Sunday" -> "Alarm set to 6";

            default -> "Alarm set to 7";

        };

        System.out.println(day);



    }
}
