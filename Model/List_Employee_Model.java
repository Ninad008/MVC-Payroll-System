package MVC.com.Model;

import javax.swing.*;
import java.sql.ResultSet;
import MVC.com.Controller.conn;

public class List_Employee_Model {

    public static ResultSet Employee_List() {

        try {
            String q = "select * from employee";
            conn c1 = new conn();
            ResultSet rs = c1.s.executeQuery(q);

            return rs;
        }
        catch (Exception e) {

        }
        return null;
    }
}
