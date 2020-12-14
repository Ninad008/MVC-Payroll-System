package MVC.com.Model;

import MVC.com.Controller.conn;

public class New_Employee_Model {
    public static boolean New_Employee(String n,String g,String a,String s,String c,String e,String p){
        try{
            conn c1 = new conn();
            String qry = "insert into employee values(null,'"+n+"','"+g+"','"+a+"','"+s+"','"+c+"','"+e+"','"+p+"')";
            c1.s.executeUpdate(qry);
            return true;
        }
        catch(Exception ee){
            ee.printStackTrace();
        }
        return false;
    }
}
