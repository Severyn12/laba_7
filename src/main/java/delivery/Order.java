package delivery;


import lombok.Getter;
import lombok.Setter;
import users.User;

import java.util.LinkedList;

@Getter
@Setter
public class Order {
    private Payment payment;
    private Delivery delivery;
    private LinkedList<Item> items = new LinkedList();
    private LinkedList<User> users = new LinkedList();

    public double calculate_total_price(){
        double total_price = 0;
        for (Item item: items){
            total_price += item.getPrice();
        }
        return total_price;
    }

    public void add_user(User user){
        users.add(user);
    }

    public void remove_user(User user){
        if (users.size() > 0 && users.contains(user)){
            users.remove(user);
        }
        else{
            System.out.println("There is no such user.");
        }
    }

    public void notifyUsers(){
        for (User user: users){
            user.update("Your orders are ready!");
        }
    }

    public void order(){
        this.notifyUsers();
    }

    public void addItem(Item new_item){
        items.add(new_item);
    }

    public void remove_item(Item item){
        if (items.size() > 0 && items.contains(item)){
            items.remove(item);
        }
        else{
            System.out.println("There is no such item.");
        }
    }

    public String process_order(){
        String msg = ("Your order is being processed.");
        return msg;
    }

}
