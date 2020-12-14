package MVC.com.Controller;

import MVC.com.Model.Take_Attendance_Model;

public class Take_Attendance_Controller {
    public static boolean Take_Attendance_Model(String id,String dt,String f, String s) {
        boolean bo= Take_Attendance_Model.Take_Attendance_Model(id, dt, f, s);
        return bo;
    }
}

