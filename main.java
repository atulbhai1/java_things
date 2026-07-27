import java.sql.*;


public class  main{
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql:demo","postgres","16042010");
        System.out.println("Connected to database successfully");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from student");
        while (rs.next()) {
            String name = rs.getString("sname");
            int id = rs.getInt("sid");
            int marks = rs.getInt("marks");
            System.out.println(id+" : "+name+" : "+marks);
        }



        con.close();
        System.out.println("Connection closed successfully");
    }
}
