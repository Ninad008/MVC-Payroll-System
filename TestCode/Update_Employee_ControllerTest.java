import MVC.com.Controller.New_Employee_Controller;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import MVC.com.Controller.Update_Employee_Controller;
import MVC.com.Controller.conn;
import MVC.com.Model.Update_Employee_Model;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class Update_Employee_ControllerTest {

    @Test
    void update_Employee_Show() throws SQLException {
        String name = null;
        ResultSet rs = Update_Employee_Controller.Update_Employee_Show();
        while(rs.next())
        {
            name=rs.getString(2);
        }
        assertEquals("Reihan",name);
    }

    @Test
    void update_Employee() throws SQLException{
        String n = "Kate";
        String g = "Male";
        String a = "Spear";
        String s = "Kabul";
        String c = "Kabul";
        String e = "kite@gmail.com";
        String p = "91010";
        String c2 = "8";
        boolean bo= Update_Employee_Model.Update_Employee(n,g,a,s,c,e,p,c2);
        assertTrue(bo);
    }
}




