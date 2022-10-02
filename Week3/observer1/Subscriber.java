package Week3.observer1;

import java.util.List;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> discounts) {
        System.out.println("Dear " + name + "\n Here our current discounts of gym subscriptions:\n" + discounts +
                "\n=======\n");
    }
}
