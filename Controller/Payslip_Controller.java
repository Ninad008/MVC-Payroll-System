package MVC.com.Controller;

import MVC.com.Model.PaySlip_Model;
import java.sql.ResultSet;

public class Payslip_Controller {
    public static ResultSet Payslip_Controller(){
        ResultSet rs= PaySlip_Model.Payslip_Salary();
        return rs;
    }
    public static ResultSet Payslip_Controller1(String c1){
        ResultSet rs= PaySlip_Model.Payslip1(c1);
        return rs;
    }
    public static ResultSet Payslip_Controller2(String c1){
        ResultSet rs= PaySlip_Model.Payslip2(c1);
        return rs;
    }
}
