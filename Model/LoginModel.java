package MVC.com.Model;

import java.sql.ResultSet;
import MVC.com.Controller.conn;


public class LoginModel {
    public LoginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }
    private String username;
    private String password;

    public boolean isValidUser() {
        String query = "select * from dbname where ....";
        try {
            conn c1 = new conn();
            String u = this.username;
            String v = this.password;

            String q = "select * from login where username='" + u + "' and password='" + v + "'";

            ResultSet rs = c1.s.executeQuery(q);
            return rs.next();

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
