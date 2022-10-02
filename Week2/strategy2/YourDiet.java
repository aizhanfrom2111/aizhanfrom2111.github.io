package Week2.strategy2;

public class YourDiet {
    Mode mode;

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void executeMode(){
        mode.timeTo();
    }
}
