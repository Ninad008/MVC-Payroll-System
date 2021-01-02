import MVC.com.Model.Salary_Model;
import MVC.com.Controller.Salary_Controller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class Salary_ControllerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void salary() throws SQLException {
        String id="8";
        String hra="1000";
        String da="1500";
        String med="2500";
        String pf="2500";
        String basic="10000";
        int bo= Salary_Controller.Salary(id, hra, da, med, pf, basic);
        assertEquals(1,bo);
    }
}