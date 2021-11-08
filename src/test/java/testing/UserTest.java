package testing;




import users.Receiver;
import users.Sender;
import users.User;

import static org.junit.Assert.assertTrue;


public class UserTest {
    private User sender = new Sender();
    private User receiver = new Receiver();

    @org.junit.jupiter.api.Test
    void instance_test() {

        assertTrue(sender instanceof User);
        assertTrue(sender instanceof Sender);

        assertTrue(receiver instanceof User);
        assertTrue(receiver instanceof Receiver);

    }


}
