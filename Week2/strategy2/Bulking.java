package Week2.strategy2;

public class Bulking implements Mode{
    @Override
    public void timeTo() {
        System.out.println("Eat More, than you train");
    }
}
