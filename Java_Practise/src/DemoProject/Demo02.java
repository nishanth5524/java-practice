
package DemoProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo02 {
    




    void tableCreate(){
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculty?zeroDateTimeBehavior=convertToNull","root","");
            Statement  st = con.createStatement();
           // String query = "delete from qanda where Qnum<=10 && Qnum>=0;";
        String query = "update qwert set Time=null where Qnum<=99 && Qnum>=2;";               
           
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

        new Demo02().tableCreate();
    }
    }

