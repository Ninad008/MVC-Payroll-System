import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import MVC.com.Controller.List_Attendance_Controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import static org.junit.jupiter.api.Assertions.assertEquals;


class List_Attendance_ControllerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void attendance_List() throws SQLException{
        int id =0;
        String date = null;
        String f_half=null;
        String s_half=null;
        ResultSet rs = List_Attendance_Controller.Attendance_List();
        while(rs.next())
        {
            id=rs.getInt(1);
            f_half=rs.getString(3);
            s_half=rs.getString(4);
        }
        assertEquals(7,id);
        assertEquals("Present",f_half);
        assertEquals("Leave",s_half);
        rs.close();
    }
}