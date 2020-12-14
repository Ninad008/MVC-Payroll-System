package MVC.com.Model;

import java.sql.ResultSet;
import MVC.com.Controller.conn;

public class Take_Attendance_Model {
    public static ResultSet Take_Attendance() {
        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            return rs;
        } catch (Exception e) {
        }
        return null;
    }

    public static boolean Take_Attendance_Model(String id,String dt,String f, String s) {
        try {
            conn c1 = new conn();
            String qry = "insert into attendence values("+ id +",'"+dt+"','"+f+"','"+s+"')";
            c1.s.executeUpdate(qry);
            return true;
        } catch (Exception ee) {
            ee.printStackTrace();
        }
        return false;
    }
}
