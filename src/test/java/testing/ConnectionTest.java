package testing;


import db.Connection;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConnectionTest {
    private Connection connection_1 = Connection.getConnection();
    private Connection connection_2 = Connection.getConnection();

    @org.junit.jupiter.api.Test
    void instance_test() {

        assertEquals(connection_1, connection_2);


        assertTrue(connection_1 instanceof Connection);
        assertTrue(connection_2 instanceof Connection);

    }
}
