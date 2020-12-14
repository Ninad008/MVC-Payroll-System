package MVC.com.Controller;

import MVC.com.Model.New_Employee_Model;

public class New_Employee_Controller {
    public static boolean New_Employee(String n,String g,String a,String s,String c,String e,String p){
        boolean bo= New_Employee_Model.New_Employee(n,g,a,s,c,e,p);
        return bo;
    }
}
