
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import MVC.com.Controller.conn;

import static org.junit.jupiter.api.Assertions.*;

class connTest {
    private conn c1;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testConn() {
        assertDoesNotThrow(()->{
            c1 = new conn();
        });
        assertNotNull(c1.c,"Please check for connection issues");

    }
}