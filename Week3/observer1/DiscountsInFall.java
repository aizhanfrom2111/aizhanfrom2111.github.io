package Week3.observer1;

import java.util.ArrayList;
import java.util.List;

public class DiscountsInFall implements Observed {
    List<String> discounts = new ArrayList<>();

    List<Observer> jimRats = new ArrayList<>();

    public void addDiscount(String discount){
        this.discounts.add(discount);
        notifyObservers();
    }
    public void removeDiscount(String discount){
        this.discounts.remove(discount);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.jimRats.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.jimRats.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : jimRats){
            observer.handleEvent(this.discounts);
        }
    }


}
