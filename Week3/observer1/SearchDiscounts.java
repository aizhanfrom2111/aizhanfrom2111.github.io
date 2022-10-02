package Week3.observer1;

public class SearchDiscounts {
    public static void main(String[] args) {
        DiscountsInFall currentDs = new DiscountsInFall();

        currentDs.addDiscount("Buy 1 monthly subscription for a 15k until 01.11.22");
        currentDs.addDiscount("Refer a friend and get 10% off");
        currentDs.addDiscount("Only in this week we have 50% discount for a three-month subscription");

        Observer numberOne = new Subscriber("Toji Fushiguro");
        Observer numberTwo = new Subscriber("Jotaro Kujo");
        Observer numberThree = new Subscriber("Guts");

        currentDs.addObserver(numberOne);
        currentDs.addObserver(numberTwo);
        currentDs.addObserver(numberThree);

        currentDs.addDiscount("Buy an yearly subscription and get a 2kg of protein for free");

        currentDs.removeDiscount("Refer a friend and get 10% off");
    }
}
