import java.sql.*;


public class  main{
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql:demo","postgres","16042010");
        System.out.println("Connected to database successfully");
        Statement st = con.createStatement();
        boolean status = st.execute("insert into student values (11, 34, 'Jane')");
        System.out.println("Status:"+status);


        con.close();
        System.out.println("Connection closed successfully");
    }
}
