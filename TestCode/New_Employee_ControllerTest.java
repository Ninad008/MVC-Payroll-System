import MVC.com.Controller.New_Employee_Controller;
import MVC.com.Controller.conn;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import static org.junit.jupiter.api.Assertions.*;

class New_Employee_ControllerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() throws SQLException {
        conn con = new conn();
        String str = "delete from employee where name = '"+ "Kate" +"'";
        con.s.executeUpdate(str);
    }

    @Test
    void new_Employee() {
        String n = "Kate";
        String g = "Male";
        String a = "Spear";
        String s = "Kabul";
        String c = "Kabul";
        String e = "kite@gmail.com";
        String p = "91010";
        boolean rs = New_Employee_Controller.New_Employee(n,g,a,s,c,e,p);
        assertTrue(rs);
    }

}