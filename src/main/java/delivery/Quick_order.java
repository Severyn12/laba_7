package delivery;


import flowers.FLowerPack;
import flowers.Flower;

public class Quick_order {
    private static Delivery delivery = new Post_delivery_strategy();
    private static Payment payment = new Pay_pal_payment_strategy();
    private static FLowerPack fl_pack = new FLowerPack();

    public static Order createOrder(Flower fl, int amount){
        Order order = new Order();
        order.setDelivery(Quick_order.delivery);
        order.setPayment(Quick_order.payment);
        Quick_order.fl_pack.setAmount(amount);
        Quick_order.fl_pack.setFlower(fl);
        order.addItem(Quick_order.fl_pack);

        return order;
    }
}
