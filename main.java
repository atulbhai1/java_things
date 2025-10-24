class Student{
    int rollin;
    String name;
    int mark;
}

public class main {
    public static void main(String a[]){
        Student s1 = new Student();
        s1.name = "Atul";
        s1.mark = 88;
        s1.rollin = 1;
        Student s2 = new Student();
        s2.name = "Bart";
        s2.mark = 78;
        s2.rollin = 2;
        Student s3 = new Student();
        s3.name = "Harsh";
        s3.mark = 98;
        s3.rollin = 3;
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for (Student student_temp: students){
            System.out.println(student_temp.rollin+". "+student_temp.name+":"+student_temp.mark);
        }

    }

}
