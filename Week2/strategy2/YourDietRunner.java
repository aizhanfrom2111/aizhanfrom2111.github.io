package Week2.strategy2;

public class YourDietRunner {
    public static void main(String[] args) {
        YourDiet yourDiet = new YourDiet();

        yourDiet.setMode(new Bulking());
        yourDiet.executeMode();

        yourDiet.setMode(new Cutting());
        yourDiet.executeMode();
    }
}
