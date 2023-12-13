
package my.note;


//import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
public class DB {

   
    public static void main(String[] args) throws SQLException {
        getConnection();
      // sizeArabic();
       /* personn person=new personn();
        person.setName("abdo");
        person.setAge(25);
        insert(person);*/
      /* ArrayList<personn> personlist = getpersons();
       System.out.println(personlist);
        System.out.println(personlist.get(0).getAge());*/
      //System.out.println(Deleteperson(2));
       
    }

    public static Connection getConnection() {
        try{
          Class.forName("com.mysql.cj.jdbc.Driver"); // select driver connect to database
           //Class.forName("MySQL ODBC 8.0 UNICODE Driver"); // select driver connect to database
          String url="jdbc:mysql://localhost:3306/";//URL database
          // String url="MYSQL8001.site4now.net/";//URL database
         //String url="Server=MYSQL8001.site4now.net;Database=db_a93e01_school;Uid=a93e01_school;Pwd=abdo2001";
         //String url="Driver={MySQL ODBC 8.0 UNICODE Driver};Server=MYSQL8001.site4now.net;Database=db_a93e01_school;Uid=a93e01_school;Password=YOUR_DB_PASSWORD";
          String databaseName="school_data";
          String userName="root";
          String password="";
         Connection con=DriverManager.getConnection(url+ databaseName,userName,password);
          //Connection con=DriverManager.getConnection(url);
                      System.out.println("connected successfully");
                      return con;

        }catch(Exception e){
            System.out.println("could not connection to database");
            e.printStackTrace();
            JOptionPane.showMessageDialog(new DEP(), e.toString());
        }
        return null;
        
    }
    
    public static void insert(Attribute person){
        Connection conn=getConnection();
        try{
           String sql ="INSERT INTO arabic(id,student_name,class,test,exam,arabic_average) VALUES (null,?,?,?,?,?)"; 
           PreparedStatement stmt =conn.prepareStatement(sql);
           //stmt.setDouble(1, person.getTest());
           stmt.setString(1, person.getStudent_name());
           stmt.setString(2, person.getClasse());
           
           stmt.setString(3, person.getTest());
           stmt.setString(4, person.getExam());
           stmt.setString(5, person.getAverage());
           stmt.execute();
                        System.out.println(" insert Successfully");
           conn.close();
        }catch(SQLException se){
                        System.err.println("could not insert data");
                        se.printStackTrace();

        }
    }
    
    public static ArrayList<Attribute> getpersons(){
        Connection conn=getConnection();
        Statement stmt;
        ArrayList<Attribute>  personlist =new ArrayList();
        try{
            stmt=conn.createStatement();
            ResultSet rs =stmt.executeQuery("select id,Dipartement_name,password from dipartement");
            while(rs.next()){//next() bcause other data going in rs(resultset)
               Attribute person =new Attribute();
               person.setId(rs.getInt("id"));
               person.setDipartement_name(rs.getString("Dipartement_name"));
               person.setPassword(rs.getString("password"));
               personlist.add(person);
                
            }
            conn.close();
            return personlist;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
        
        
    }
    public static ArrayList<Attribute> getpersons2(){
        Connection conn=getConnection();
        Statement stmt;
        ArrayList<Attribute>  personlist =new ArrayList();
        try{
            stmt=conn.createStatement();
            ResultSet rs =stmt.executeQuery("select id,teacher_name,password from teachers");
            while(rs.next()){//next() bcause other data going in rs(resultset)
               Attribute person =new Attribute();
               person.setId(rs.getInt("id"));
               person.setTeacher_name(rs.getString("teacher_name"));
               person.setPassword(rs.getString("password"));
               personlist.add(person);
                
            }
            conn.close();
            return personlist;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
        
        
    }
    public static ArrayList<Attribute> getpersons3(){
        Connection conn=getConnection();
        Statement stmt;
        ArrayList<Attribute>  personlist =new ArrayList();
        try{
            stmt=conn.createStatement();
            ResultSet rs =stmt.executeQuery("select id,student_name,password from student_info");
            while(rs.next()){//next() bcause other data going in rs(resultset)
               Attribute person =new Attribute();
               person.setId(rs.getInt("id"));
               person.setStudent_name(rs.getString("student_name"));
               person.setPassword(rs.getString("password"));
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
    
    public static int sizeArabic() throws SQLException{
     try{
        Connection conn=getConnection();
    int size =0;
    Statement stmt;
     stmt=conn.createStatement();
         ResultSet rs =stmt.executeQuery("select * from arabic ");
 size = rs.getRow(); 
      
      
      System.out.println("Size of the 3rd column : "+size);

 // get row id*/ 
 return size;
//}
    }catch(Exception e){
    System.err.println(e.getMessage());
         JOptionPane.showMessageDialog(new TEACHER(), e.getMessage());
}
return 0;
    }
     public static int update(String str,Attribute person)
  {
    try
    {
      // create a java mysql database connection
     /* String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://localhost/test";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "");*/
    Connection conn=getConnection();
    int size =0;
    Statement stmt;
      // create the java mysql update preparedstatement
      String query = "update arabic set student_name= ?,class=?,test=?,exam=?,arabic_average=? where student_name = ?";
      PreparedStatement preparedStmt = conn.prepareStatement(query);
       preparedStmt.setString(6,str);
     // preparedStmt.setString(1, str);
           preparedStmt.setString(1, person.getStudent_name());
           preparedStmt.setString(2, person.getClasse());
           
           preparedStmt.setString(3, person.getTest());
           preparedStmt.setString(4, person.getExam());
           preparedStmt.setString(5, person.getAverage());
           stmt=conn.createStatement();
           /*ResultSet rs =stmt.executeQuery("select arabic from school_data");
         
if (rs != null) 
{
  rs.last();    // moves cursor to the last row
  size = rs.getRow(); // get row id 
}*/
      // execute the java preparedstatement
      preparedStmt.executeUpdate();
       System.out.println(" ubdate Successfully");
       
      conn.close();
      return 1;
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
      
    }
    return -1;
  }

    
}
