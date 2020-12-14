package MVC.com.Model;

import java.sql.ResultSet;
import MVC.com.Controller.conn;

public class List_Attendance_Model {

    public static ResultSet Attendance_List() {

        try {
            String q = "select * from attendence";
            conn c1 = new conn();
            ResultSet rs = c1.s.executeQuery(q);

            return rs;
        }
        catch (Exception e) {

        }
        return null;
    }
}
