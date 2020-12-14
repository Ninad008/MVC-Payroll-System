package MVC.com.Controller;

import MVC.com.Model.Update_Employee_Model;

import java.sql.ResultSet;

public class Update_Employee_Controller {
    public static ResultSet Update_Employee_Show(){
        ResultSet rs= Update_Employee_Model.Update_Employee_Show();
        return rs;
    }
    public static ResultSet Update_Employee_Select(String c2){
        ResultSet rs= Update_Employee_Model.Update_Employee_Select(c2);
        return rs;
    }
    public static boolean Update_Employee(String n,String g, String a, String s, String c, String e, String p,String c2){
        boolean bo= Update_Employee_Model.Update_Employee(n,g,a,s,c,e,p,c2);
        return bo;
    }
    public static boolean Update_Employee_Delete(String c2){
        boolean bo= Update_Employee_Model.Update_Employee_Delete(c2);
        return bo;
    }
}
