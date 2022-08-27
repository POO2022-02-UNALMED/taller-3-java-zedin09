package taller3.televisores;

public class Control {
    private TV tv;

    public void enlazar(TV tv){
        this.tv = tv;
        this.tv.setControl(this);
    }

    public TV getTv() {
        return tv;
    }
    public void setTv(TV tv) {
        this.tv = tv;
    }

    /*Estado*/
    public void turnOn() {
        this.tv.turnOn();
    }
    public void turnOff() {
        this.tv.turnOff();
    }
    /*Canal*/
    public void canalUp(){
        this.tv.canalUp();
    }
    public void canalDown(){
        this.tv.canalDown();
    }
    /*Volumen*/
    public void volumenUp(){
        this.tv.volumenUp();
    }
    public void volumenDown(){
        this.tv.volumenDown();
    }
    /*Canal*/
    public void setCanal(int canal) {
        this.tv.setCanal(canal);
    }
}
