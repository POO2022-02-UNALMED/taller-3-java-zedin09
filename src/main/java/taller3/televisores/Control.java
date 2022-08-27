package taller3.televisores;

public class Control {
    TV tv;

    public void enlazar(TV tv){
        this.tv = tv;
        this.tv.control = this;
    }

    TV getTv() {
        return tv;
    }
    void setTv(TV tv) {
        this.tv = tv;
    }
}
