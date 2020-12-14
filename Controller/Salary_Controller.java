package MVC.com.Controller;

import MVC.com.Model.Salary_Model;

public class Salary_Controller {
    public static int Salary(String id,String hra,String da,String med,String pf,String basic){
        int bo= Salary_Model.Salary(id, hra, da, med, pf, basic);
        return bo;
    }
}
