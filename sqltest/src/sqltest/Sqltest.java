
package sqltest;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import java.util.ArrayList;
/*import java.sql.DriverManager;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Enumeration;
import java.util.ArrayList;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Types;
import java.sql.ResultSet;
import java.sql.SQLException;*/
/**
 *
 * @author dadab
 */
public class Sqltest {

   
    public static void main(String[] args) {
        //getConnection();
        personn person=new personn();
        person.setName("abdo");
        person.setAge(25);
        insert(person);
       /*ArrayList<personn> personlist = getpersons();
       System.out.println(personlist);
        System.out.println(personlist.get(0).getAge());*/
      //System.out.println(Deleteperson(2));
       
    }

    private static Connection getConnection() {
        try{
          Class.forName("com.mysql.jdbc.Driver"); // select driver connect to database
          String url="jdbc:mysql://localhost:3306/";//URL database
          String databaseName="sust";
          String userName="root";
          String password="";
          Connection con=DriverManager.getConnection(url+ databaseName,userName,password);
                      System.out.println("connected successfully");
                      return con;

        }catch(Exception e){
            System.out.println("could not connection to database");
            e.printStackTrace();
        }
        return null;
        
    }
    
    public static void insert(personn person){
        Connection conn=getConnection();
        try{
           String sql ="INSERT INTO persons(id,name,age) VALUES (null,?,?)"; 
           PreparedStatement stmt =conn.prepareStatement(sql);
           stmt.setString(1, person.getName());
           stmt.setInt(2, person.getAge());
           stmt.execute();
                        System.out.println("person insert Successfully");
           conn.close();
        }catch(SQLException se){
                        System.err.println("could not insert data");
                        se.printStackTrace();

        }
    }
    
    public static ArrayList<personn> getpersons(){
        Connection conn=getConnection();
        Statement stmt;
        ArrayList<personn>  personlist =new ArrayList();
        try{
            stmt=conn.createStatement();
            ResultSet rs =stmt.executeQuery("select id,name,age from persons");
            while(rs.next()){//next() bcause other data going in rs(resultset)
               personn person =new personn();
               person.setId(rs.getInt("id"));
               person.setName(rs.getString("name"));
               person.setAge(rs.getInt("age"));
               personlist.add(person);
                
            }
            conn.close();
            return personlist;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
        
        
    }
    
    public static int Deleteperson(int id){
          Connection conn=getConnection();
        PreparedStatement stmt;
        try{
          stmt =conn.prepareStatement("delete from persons where id=?");
          stmt.setInt(1, id);
          int i=stmt.executeUpdate();
          conn.close();
          return i;
        }catch(SQLException eq){
            eq.printStackTrace();
        }
        return -1;
    }
    
}
