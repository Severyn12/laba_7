package users;

import lombok.Getter;

import java.util.Random;

@Getter
abstract public class User {

    private int id = new Random().nextInt(20);
    abstract public void update(String status);
}
