package MVC.com.Model;

import java.sql.ResultSet;
import MVC.com.Controller.conn;

public class PaySlip_Model {
    public static ResultSet Payslip_Salary(){
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from salary");
            return rs;
        }
        catch(Exception e) { }
        return null;
    }

    public static ResultSet Payslip1(String c1){
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from employee where id="+c1);
            return rs;
        }
        catch(Exception ee) {
            ee.printStackTrace();
        }
        return null;
    }
    public static ResultSet Payslip2(String c1){
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from salary where id="+c1);
            return rs;
        }
        catch(Exception ee) {
            ee.printStackTrace();
        }
        return null;
    }
}