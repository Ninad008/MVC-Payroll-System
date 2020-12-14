package MVC.com.Controller;

import MVC.com.Model.Update_Salary_Model;

import java.sql.ResultSet;

public class Update_Salary_Controller {
    public static ResultSet Update_Salary_Show(){
        ResultSet rs= Update_Salary_Model.Update_Salary_Show();
        return rs;
    }
    public static ResultSet Update_Salary_Select(String c2){
        ResultSet rs= Update_Salary_Model.Update_Salary_Select(c2);
        return rs;
    }
    public static boolean Update_Salary(String hra,String da, String med, String pf, String basic, String c2){
        boolean bo= Update_Salary_Model.Update_Salary(hra,da,med,pf,basic,c2);
        return bo;
    }
    public static boolean Update_Salary_Delete(String c2){
        boolean bo= Update_Salary_Model.Update_Salary_Delete(c2);
        return bo;
    }
}
