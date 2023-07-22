import java.sql.*;
public class JDBCdemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String username="root";
        String password="13J@n1996";
        try (Connection connect=DriverManager.getConnection(url,username,password)){
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            try (Statement a = connect.createStatement()) {

                //String b="Create Table Employee(Id int, Name Varchar(15))";
                //String b="Insert into Employee values(1,'asmita')"; // a.executeupdate(b);//create , Insert
                //preparedStatement.setInt(1, 1);
                //			preparedStatement.setString(2, "Bharat");
                //			preparedStatement.setInt(3, 62000);
                //
                //			//execute query
                //			preparedStatement.executeUpdate();
                String b="Select * from employee";
                ResultSet r=a.executeQuery(b); //Select
                while(r.next()){//select
                    String id=r.getString("id");//select
                    String name=r.getString("name");//select
                    System.out.println(id+" "+name);//select
                }
                System.out.println("Created");

            }
        }
        catch(SQLException e){
    } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
