package MVC.com.Model;

import java.sql.ResultSet;
import MVC.com.Controller.conn;

import javax.swing.*;

public class Update_Employee_Model {
    public static ResultSet Update_Employee_Show(){
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            return rs;
        }
        catch (Exception e){}
        return null;
    }
    public static ResultSet Update_Employee_Select(String c2){
        try{
            conn c1 = new conn();
            ResultSet rs = c1.s.executeQuery("select * from employee where id="+c2);
            return rs;
        }
        catch (Exception e){}
        return null;
    }
    public static boolean Update_Employee(String n,String g, String a, String s, String c, String e, String p,String c2){
        try{
            conn c1 = new conn();
            String qry = "update employee set name='"+n+"',gender='"+g+"',address='"+a+"',state='"+s+"',city='"+c+"',email='"+e+"',phone='"+p+"'   where id="+c2;
            c1.s.executeUpdate(qry);
            return true;

        }catch(Exception ee){
            ee.printStackTrace();
        }
        return false;
    }
    public static boolean Update_Employee_Delete(String c2){
        try{
            conn c1 = new conn();
            c1.s.executeUpdate("delete from employee where id="+c2);
            return true;
        }catch(Exception ee){
            ee.printStackTrace();
        }
        return false;
    }
}
