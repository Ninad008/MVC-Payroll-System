package MVC.com.Controller;

import MVC.com.Model.List_Employee_Model;

import java.sql.ResultSet;

public class List_Employee_Controller {
    public static ResultSet Employee_List(){
        ResultSet rs= List_Employee_Model.Employee_List();
        return rs;
    }
}
