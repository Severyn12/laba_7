package testing;

import delivery.Order;
import delivery.Pay_pal_payment_strategy;
import delivery.Post_delivery_strategy;
import delivery.Quick_order;
import flowers.Color;
import flowers.FLowerPack;
import flowers.Flower;
import flowers.FlowerType;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Quick_orderTest {
    private Flower fl_1 = new Flower();
    private Order order = Quick_order.createOrder(fl_1, 3);

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        fl_1.setPrice(12.4);
        fl_1.setColor(Color.RED);
        fl_1.setFlowerType(FlowerType.ROSE);
    }

    @org.junit.jupiter.api.Test
    void instance_test() {

        assertTrue(order.getDelivery() instanceof Post_delivery_strategy);
        assertTrue(order.getPayment() instanceof Pay_pal_payment_strategy);
        assertTrue(order instanceof Order);

    }

    @org.junit.jupiter.api.Test
    void item_user_test() {

        assertTrue(order.getItems().get(0) instanceof FLowerPack);
        assertEquals(order.getUsers().size(), 0);
        assertEquals(order.getItems().size(), 1);
        assertEquals(order.calculate_total_price(), 37.2);

    }
}
