import MVC.com.Model.LoginModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginModelTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void isValidUser() {
        try {
            LoginModel loginmodel = new LoginModel("admin", "admin");
            Boolean bool = loginmodel.isValidUser();

            assertTrue(bool);

        } catch (Exception e) {
            fail("Problem found");

        }
    }
}