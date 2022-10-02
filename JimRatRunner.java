package Week2.strategy1;

public class JimRatRunner {
    public static void main(String[] args) {
        JimRat jimRat = new JimRat();

        jimRat.setWeGoJim(new Monday());
        jimRat.executeWeGoJim();

        jimRat.setWeGoJim(new Tuesday());
        jimRat.executeWeGoJim();

        jimRat.setWeGoJim(new Wednesday());
        jimRat.executeWeGoJim();

        jimRat.setWeGoJim(new Thursday());
        jimRat.executeWeGoJim();

        jimRat.setWeGoJim(new Friday());
        jimRat.executeWeGoJim();

        jimRat.setWeGoJim(new Saturday());
        jimRat.executeWeGoJim();

        jimRat.setWeGoJim(new Sunday());
        jimRat.executeWeGoJim();
    }
}
