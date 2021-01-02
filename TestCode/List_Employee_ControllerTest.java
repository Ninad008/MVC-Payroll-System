import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import MVC.com.Controller.List_Employee_Controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class List_Employee_ControllerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void employee_List() throws SQLException{
            int id =0;
            String name = null;
            String gender=null;
            String address=null;
            String state=null;
            String city=null;
            String email=null;
            String phone=null;

            ResultSet rs = List_Employee_Controller.Employee_List();
            while(rs.next())
            {
                id=rs.getInt(1);
                name = rs.getString(2);
                gender=rs.getString(3);
                address=rs.getString(4);
                state=rs.getString(5);
                city=rs.getString(6);
                email=rs.getString(7);
                phone=rs.getString(8);
            }
            assertEquals(8,id);
            assertEquals("Kate",name);
            assertEquals("Male",gender);
            assertEquals("Spear",address);
            assertEquals("Kabul",state);
            assertEquals("Kabul",city);
            assertEquals("kite@gmail.com",email);
            assertEquals("91010",phone);
            rs.close();
    }
}

