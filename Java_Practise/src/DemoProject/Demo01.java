
package DemoProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo01 {
    




    void tableCreate(){
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?zeroDateTimeBehavior=convertToNull","root","");
            Statement  st = con.createStatement();
            String query = "insert into userdata values(5,'nithish')";
        
        st.executeUpdate(query);
        con.setAutoCommit(true);
            con.close();
            System.out.println("Success!    ");
        }
        catch(Exception e){
            System.out.println("---------->  "+e);
        }
    }
    public static void main(String ss[]) throws Exception{

        new Demo01().tableCreate();
    }
    }

