package Week2.strategy1;

public class JimRat {
    WeGoJim weGoJim;

    public void setWeGoJim(WeGoJim weGoJim) {
        this.weGoJim = weGoJim;
    }

    public void executeWeGoJim(){
        weGoJim.toTrainWhat();
    }
}
