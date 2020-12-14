package MVC.com.Controller;
import MVC.com.Model.List_Attendance_Model;
import java.sql.*;

public class List_Attendance_Controller {
    public static ResultSet Attendance_List(){
        ResultSet rs= List_Attendance_Model.Attendance_List();
        return rs;
    }
}
