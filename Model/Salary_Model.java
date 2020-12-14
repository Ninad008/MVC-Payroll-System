package MVC.com.Model;

import java.sql.ResultSet;
import MVC.com.Controller.conn;

public class Salary_Model{
    public static ResultSet Salary(){
        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            return rs;
        }
        catch(Exception e){}
        return null;
    }
    public static int Salary(String id,String hra,String da,String med,String pf,String basic){
        try {
            conn c1 = new conn();
            String qry = "insert into salary values(" + id + "," + hra + "," + da + "," + med + "," + pf + "," + basic + ")";
            int z = c1.s.executeUpdate(qry);
            return 1;
        }
        catch(Exception ee){
            ee.printStackTrace();
        }
        return 0;
    }
}
