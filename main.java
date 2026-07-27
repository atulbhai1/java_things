import java.sql.*;


public class  main{
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql:demo","postgres","16042010");
        System.out.println("Connected to database successfully");
        String sql = "insert into student values (?, ?, ?)";
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, 12);
        st.setInt(2, 35);
        st.setString(3, "Jack");
        st.execute();





        con.close();
        System.out.println("Connection closed successfully");
    }
}
