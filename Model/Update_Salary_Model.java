package MVC.com.Model;

import MVC.com.Controller.conn;

import java.sql.ResultSet;

public class Update_Salary_Model {
    public static ResultSet Update_Salary_Show(){
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from salary");
            return rs;
        }
        catch (Exception e){}
        return null;
    }
    public static ResultSet Update_Salary_Select(String c2){
        try{
            conn c1 = new conn();
            ResultSet rs = c1.s.executeQuery("select * from salary where id="+c2);
            return rs;
        }
        catch (Exception e){}
        return null;
    }
    public static boolean Update_Salary(String hra,String da, String med, String pf, String basic, String c2){
        try{
            conn c1 = new conn();
            String qry = "update salary set hra="+hra+",da="+da+",med="+med+",pf="+pf+",basic_salary="+basic+"  where id="+c2;
            c1.s.executeUpdate(qry);
            return true;

        }catch(Exception ee){
            ee.printStackTrace();
        }
        return false;
    }
    public static boolean Update_Salary_Delete(String c2){
        try{
            conn c1 = new conn();
            c1.s.executeUpdate("delete from salary where id="+c2);
            return true;
        }catch(Exception ee){
            ee.printStackTrace();
        }
        return false;
    }
}
